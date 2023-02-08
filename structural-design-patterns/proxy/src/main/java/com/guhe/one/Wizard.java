package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class Wizard {
	private final String name;

	public Wizard(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Wizard{" +
				"name='" + name + '\'' +
				'}';
	}
}
