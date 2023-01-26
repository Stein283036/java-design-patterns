package com.guhe.one;

/**
 * singleton design pattern implemented by using of nested static class
 *
 * @author njl
 * @date 2023/1/17
 */
public class NestedStaticClassSingleton {
	private NestedStaticClassSingleton() {
	}

	public static NestedStaticClassSingleton getInstance() {
		return NestedStaticClassSingletonHolder.INSTANCE;
	}

	private static final class NestedStaticClassSingletonHolder {
		// the instance of NestedStaticClassSingleton will only be created when it is needed.
		private static final NestedStaticClassSingleton INSTANCE = new NestedStaticClassSingleton();
	}
}
