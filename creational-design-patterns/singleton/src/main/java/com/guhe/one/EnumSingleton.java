package com.guhe.one;

/**
 * singleton design pattern implemented by enum.
 * this method is also recommened in the Book Joshua Bloch, Effective Java.
 *
 * @author njl
 * @date 2023/1/17
 */
public enum EnumSingleton {
	SINGLETON;

	// the construtor of an enum class is made private by defauly.
	/*private*/ EnumSingleton() {
	}
}
