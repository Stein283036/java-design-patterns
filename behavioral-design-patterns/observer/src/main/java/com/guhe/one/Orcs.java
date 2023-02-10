package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public class Orcs implements WeatherObserver {

	public Orcs(Weather weather) {
		weather.addObserver(this);
	}

	@Override
	public void update(WeatherType weatherType) {
		System.out.println("Orcs are facing " + weatherType.getDescription() + " weather now");
	}
}
