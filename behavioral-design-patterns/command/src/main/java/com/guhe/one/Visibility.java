package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/12
 */
public enum Visibility {
	VISIBLE("visible"),
	INVISIBLE("invisible");

	private final String title;

	Visibility(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
