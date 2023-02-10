package com.guhe.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author njl
 * @date 2023/2/9
 */
public class LogHandler implements InvocationHandler {// 提供日志加强
	private Object target;

	public LogHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// proxy 参数指的就是 代理对象 因为这个方法调用的时候 代理对象已经生成了 它内部持有当前这个 LogHandler
		// 因为代理类继承了 Proxy 而 Proxy 内部持有 InvocationHandler 且代理类的唯一一个有参构造器就是为 InvocationHandler 赋值
		// 代理对象的所有方法执行都会先进入到该方法
		logBeforeHandler(); // 代理的部分
		Object result = method.invoke(target, args); // 委托给被代理对象
		logAfterHandler(); // 代理的部分
		return result;
	}

	private void logBeforeHandler() {
		System.out.printf("log before handler %s%n", new Date());
	}

	private void logAfterHandler() {
		System.out.printf("log after handler %s%n", new Date());
	}
}
