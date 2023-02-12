package com.guhe.one;


/**
 * @author njl
 * @date 2023/2/12
 */
public abstract class Target {
	private Size size;
	private Visibility visibility;

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

	@Override
	public abstract String toString();

	public void printStatus() {
		System.out.println("size = " + getSize() + ", visibility = " + getVisibility());
	}
}
