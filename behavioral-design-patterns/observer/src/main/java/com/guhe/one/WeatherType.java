package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public enum WeatherType {
	SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn"), WINTER("Winter");

	private final String description;

	WeatherType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
