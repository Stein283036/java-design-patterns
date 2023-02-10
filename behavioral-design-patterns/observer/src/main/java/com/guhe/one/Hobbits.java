package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public class Hobbits implements WeatherObserver {

	public Hobbits(Weather weather) {
		weather.addObserver(this);
	}

	@Override
	public void update(WeatherType weatherType) {
		System.out.println("Hobbits are facing " + weatherType.getDescription() + " weather now");
	}
}
