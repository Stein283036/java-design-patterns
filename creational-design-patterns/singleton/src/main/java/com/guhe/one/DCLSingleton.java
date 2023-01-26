package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/17
 */
public class DCLSingleton {
	private DCLSingleton() {
	}

	private static DCLSingleton INSTANCE;

	public static DCLSingleton getInstance() {
		if (INSTANCE == null) {
			// multiple threads have a change going here.
			synchronized (DCLSingleton.class) { // the class object lock is unique
				// only one thread at a time could go here.
				if (INSTANCE == null) {
					// this condition is used to make sure if the instance of DCLSingleton
					// was alread instantiated by a thread.
					INSTANCE = new DCLSingleton();
				}
			}
		}
		return INSTANCE;
	}
}
