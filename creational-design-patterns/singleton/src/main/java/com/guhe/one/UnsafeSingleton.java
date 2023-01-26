package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/17
 */
public class UnsafeSingleton {
	private UnsafeSingleton() {
	}

	private static UnsafeSingleton INSTANCE;

	public static UnsafeSingleton getInstance() {
		if (INSTANCE == null) {
			// multiple threads could possibily meet the condition and enter into the block code at the same
			// time, therefore, more than one instance could be created leading to serious problem.
			INSTANCE = new UnsafeSingleton();
		}
		return INSTANCE;
	}
}
