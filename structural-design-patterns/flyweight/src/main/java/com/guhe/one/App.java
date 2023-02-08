package com.guhe.one;

import java.util.List;

/**
 * @author njl
 * @date 2023/2/8
 */
public class App {
	public static void main(String[] args) {
		// 去旅行吧
		// 先得找一个旅行商 告诉它我们想去的国家/景点/酒店 然后才能去玩
		Country china = TravelDealer.produceCountry(TravelConstants.CountryName.CHINA);
		System.out.println("china = " + china);
		List<AbstractHotel> fiveStartHotelsInChina = TravelDealer.produceHotels(TravelConstants.CountryName.CHINA, TravelConstants.HotelStar.FIVE);
		System.out.println("fiveStartHotelsInChina = " + fiveStartHotelsInChina);
		List<AbstractAttractions> amusementAttractionsInChina = TravelDealer.produceAttractions(TravelConstants.CountryName.CHINA, TravelConstants.AttractionsType.AMUSEMENT);
		System.out.println("amusementAttractionsInChina = " + amusementAttractionsInChina);
	}
}
