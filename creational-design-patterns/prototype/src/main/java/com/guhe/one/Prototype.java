package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/17
 */
public abstract class Prototype<T> implements Cloneable {
	public T copy() throws CloneNotSupportedException {
		return (T) super.clone();
	}
}
