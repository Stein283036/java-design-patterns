package com.guhe.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK 的动态代理
 *
 * @author njl
 * @date 2023/2/9
 */
public class App1 {
	public static void main(String[] args) {
		// 设置变量可以保存动态代理类，默认名称以 $Proxy0 格式命名
		System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		// 1. 创建被代理对象
		UserService userService = new UserServiceImpl();
		// 2. 获取被代理对象的类加载器
		ClassLoader classLoader = userService.getClass().getClassLoader();
		// 3. 获取被代理对象实现的所有接口
		Class<?>[] interfaces = userService.getClass().getInterfaces();
		// 4. 创建代理类的调用处理器 InvocationHandler
		InvocationHandler invocationHandler = new LogHandler(userService);
		// 5. 根据上面准备的三个参数使用 java.lang.reflect.Proxy newProxyInstance 创建代理类对象
		UserService userServiceProxy = (UserService) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
		// 6. 调用代理方法
		userServiceProxy.select();
		userServiceProxy.update();

		// static InvocationHandler getInvocationHandler(Object proxy) 用于获取指定代理对象所关联的调用处理器
		InvocationHandler h1 = Proxy.getInvocationHandler(userServiceProxy);
		System.out.println("h1 = " + h1); // h1 = com.guhe.two.LogHandler@66d3c617
		// static Class<?> getProxyClass(ClassLoader loader, Class<?>... interfaces) 返回指定接口的代理类
		Class<?> cls = Proxy.getProxyClass(classLoader, interfaces);
		System.out.println("cls = " + cls); // cls = class com.guhe.two.$Proxy0
		// static boolean isProxyClass(Class<?> cl) 返回 cl 是否为一个代理类
		System.out.println(Proxy.isProxyClass(userServiceProxy.getClass())); // true

		// 保存JDK动态代理生成的代理类，类名保存为 UserServiceProxy
		ProxyUtils.generateClassFile(userService.getClass(), "UserServiceProxy");
		// 观察 UserServiceProxy.class 类可以发现代理类继承了 Proxy 并且实现了与被代理对象相同的所有接口 以及
		// equals、hashCode、toString 等方法
		// 代理类生成的方法都以 Method 表示 通过反射调用
		// 代理类将代理的方法 通过 super.h.invoke(this, m3, (Object[])null); 调用 即通过 InvocationHandler

	}
}

interface UserService {
	public void select();

	public void update();
}

class UserServiceImpl implements UserService {
	public void select() {
		System.out.println("查询 selectById");
	}

	public void update() {
		System.out.println("更新 update");
	}
}
