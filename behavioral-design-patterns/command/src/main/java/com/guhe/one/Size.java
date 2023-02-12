package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/12
 */
public enum Size {
	SMALL("small"), NORMAL("normal");
	private final String title;

	Size(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return title;
	}
}
