package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/28
 */
public class App {
	public static void main(String[] args) {
		Captain captain = new Captain(new FishingBoatAdapter());
		captain.row();
	}
}
