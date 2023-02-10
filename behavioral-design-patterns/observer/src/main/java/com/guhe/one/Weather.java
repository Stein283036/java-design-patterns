package com.guhe.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @author njl
 * @date 2023/2/10
 */
public class Weather {
	private WeatherType currentWeather;
	private final List<WeatherObserver> weatherObservers;

	public Weather() {
		this.weatherObservers = new ArrayList<>();
		this.currentWeather = WeatherType.SPRING;
	}

	public void addObserver(WeatherObserver weatherObserver) {
		this.weatherObservers.add(weatherObserver);
	}

	public void removeObserver(WeatherObserver weatherObserver) {
		this.weatherObservers.remove(weatherObserver);
	}

	public void timePasses() {
		WeatherType[] values = WeatherType.values();
		currentWeather = values[(currentWeather.ordinal() + 1) % values.length];
		notifyObservers();
	}

	private void notifyObservers() {
		for (WeatherObserver weatherObserver : weatherObservers) {
			weatherObserver.update(currentWeather);
		}
	}
}
