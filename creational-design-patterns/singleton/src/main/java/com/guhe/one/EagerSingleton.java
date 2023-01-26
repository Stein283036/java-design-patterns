package com.guhe.one;

/**
 * eager-mode singleton desgin pattern
 *
 * @author njl
 * @date 2023/1/17
 */
public class EagerSingleton {
	// make the EagerSingleton constuctor with no arguments private.
	private EagerSingleton() {
	}

	// this will create an instance when EagerSingleton class is loaded, so it may
	// lead to a waste if this instance is not used througout an application.
	private static final EagerSingleton INSTANCE = new EagerSingleton();

	// provide public access point
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}
