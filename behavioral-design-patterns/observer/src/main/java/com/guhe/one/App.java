package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public class App {
	public static void main(String[] args) {
		Weather weather = new Weather();
		Orcs orcs = new Orcs(weather);
		Hobbits hobbits = new Hobbits(weather);

		weather.timePasses();
		System.out.println("================================");
		weather.timePasses();
		System.out.println("================================");
		weather.timePasses();
		System.out.println("================================");
		weather.timePasses();

	}
}
