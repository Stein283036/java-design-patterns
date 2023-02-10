package com.guhe.two;

import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * cglib 动态代理
 *
 * @author njl
 * @date 2023/2/9
 */
public class App2 {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO(); // 被代理对象
		UserDAOCallback1 userDAOCallback1 = new UserDAOCallback1(); // 被代理对象的第一个方法拦截器回调对象
		UserDAOCallback2 userDAOCallback2 = new UserDAOCallback2(); // 被代理对象的第二个方法拦截器回调对象
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(userDAO.getClass());
//		enhancer.setCallback(userDAOCallback1);
		// 设置回调
		enhancer.setCallbacks(new Callback[]{userDAOCallback1, userDAOCallback2});
		// 设置回调前过滤
		UserDAOFilter userDAOFilter = new UserDAOFilter();
		enhancer.setCallbackFilter(userDAOFilter);
		UserDAO userDAOProxy = (UserDAO) enhancer.create();

		userDAOProxy.select();
		userDAOProxy.update();

		// CGLIB 创建动态代理类的模式是：
		// 查找目标类上的所有非 final public 修饰的方法定义
		// 将这些方法的定义转换成字节码
		// 将组成的字节码转换成相应的代理的class对象
		// 实现 MethodInterceptor 接口，用来处理对代理类上所有方法的请求 或者实现 CallbackFilter 过滤回调
	}
}

class UserDAO {
	public void select() {
		System.out.println("UserDao 查询 select");
	}

	public void update() {
		System.out.println("UserDao 更新 update");
	}
}

class UserDAOCallback1 implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		// o = com.guhe.two.UserDAO$$EnhancerByCGLIB$$4ba4334d@78c03f1f
		// method = public void com.guhe.two.UserDAO.select()
		// methodProxy = MethodProxy
		before();
		Object result = methodProxy.invokeSuper(o, objects);
		after();
		return result;
	}

	private void before() {
		System.out.printf("log1 start time [%s] %n", new Date());
	}

	private void after() {
		System.out.printf("log1 end time [%s] %n", new Date());
	}
}

class UserDAOCallback2 implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		before();
		Object result = methodProxy.invokeSuper(o, objects);
		after();
		return result;
	}

	private void before() {
		System.out.printf("log2 start time [%s] %n", new Date());
	}

	private void after() {
		System.out.printf("log2 end time [%s] %n", new Date());
	}
}

// 设置针对被代理对象的不同方法返回不同的回调增强
class UserDAOFilter implements CallbackFilter {
	@Override
	public int accept(Method method) {
		if ("select".equals(method.getName())) { // 针对 select 方法
			return 0; // 返回回调列表中的第一个回调
		}
		return 1; // 针对其它的方法返回第二个回调
	}
}
