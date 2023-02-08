package com.guhe.two;

import java.util.concurrent.Callable;

/**
 * @author njl
 * @date 2023/2/8
 */
public class RunnableAdapter implements Runnable { // 注意看命名规范 适配的接口名+Adapter 实现了 Callable 接口且接口的规范也与被适配接口一致
	private Callable<?> callable;

	public RunnableAdapter(Callable<?> callable) {
		this.callable = callable;
	}

	@Override
	public void run() {
		try {
			// 将 Runnable 接口的具体实现委托给被适配接口
			callable.call();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
