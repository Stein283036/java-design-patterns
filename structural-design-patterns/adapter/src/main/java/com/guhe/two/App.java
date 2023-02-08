package com.guhe.two;

/**
 * @author njl
 * @date 2023/2/8
 */
public class App {
	public static void main(String[] args) {
//		Thread thread = new Thread(new Task()); // compile error Runnable 接口和 Callable 接口彼此之前不能相互转换
		// 这时就需要一个适配器将 Callable 接口转换成合适的 Runnable 接口
		Thread thread = new Thread(new RunnableAdapter(new Task()));
		thread.start();
	}
}
