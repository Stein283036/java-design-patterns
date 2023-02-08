package com.guhe.two;

import java.util.concurrent.Callable;

/**
 * @author njl
 * @date 2023/2/8
 */
public class Task implements Callable<String> {
	@Override
	public String call() throws Exception {
		System.out.println("Hello Adapter");
		return "Hello Adapter";
	}
}
