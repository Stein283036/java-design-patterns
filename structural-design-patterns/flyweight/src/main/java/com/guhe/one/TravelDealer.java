package com.guhe.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author njl
 * @date 2023/2/8
 */
// 旅行商 这里当做工厂用 我们告诉它我们想去的国家 酒店星级 景点
public class TravelDealer {
	private static final List<Country> COUNTRIES;

	private static final ConcurrentHashMap<TravelConstants.CountryName, List<AbstractAttractions>> ATTRACTIONS_OF_COUNTRY;

	private static final ConcurrentHashMap<TravelConstants.CountryName, List<AbstractHotel>> HOTELS_OF_COUNTRY;

	static {
		COUNTRIES = new ArrayList<>();
		China china = new China(
				"CHINA",
				Arrays.asList(new GreatWall("长城", 100, TravelConstants.AttractionsType.SITE), new Disney("迪士尼", 2000, TravelConstants.AttractionsType.AMUSEMENT)),
				Arrays.asList(new FlowerHotel("华朵酒店", 2500, TravelConstants.HotelStar.FIVE), new PoorHotel("贫舍酒店", 1000, TravelConstants.HotelStar.THREE))
		);
		COUNTRIES.add(china);
		// COUNTRIES.add(usa); 等等

		ATTRACTIONS_OF_COUNTRY = new ConcurrentHashMap<>();
		HOTELS_OF_COUNTRY = new ConcurrentHashMap<>();
		for (Country country : COUNTRIES) {
			ATTRACTIONS_OF_COUNTRY.put(TravelConstants.CountryName.valueOf(country.getName()), country.getAttractions());
			HOTELS_OF_COUNTRY.put(TravelConstants.CountryName.valueOf(country.getName()), country.getHotels());
		}
	}

	public static Country produceCountry(TravelConstants.CountryName countryName) {
		// 亨元模式的体现 从缓存的 COUNTRIES 中获取国家
		for (Country country : COUNTRIES) {
			if (country.getName().equals(countryName.name())) {
				return country;
			}
		}
		return null;
	}

	// 下面两个方法的执行都是有前提的 即需要在某个具体国家下进行查找 比如去中国旅游就找中国的酒店和中国的景点

	public static List<AbstractHotel> produceHotels(TravelConstants.CountryName countryName, TravelConstants.HotelStar hotelStar) {
		return HOTELS_OF_COUNTRY.get(countryName).stream().filter((hotel) -> hotel.getStar() == hotelStar).collect(Collectors.toList());
	}

	public static List<AbstractAttractions> produceAttractions(TravelConstants.CountryName countryName, TravelConstants.AttractionsType attractionsType) {
		return ATTRACTIONS_OF_COUNTRY.get(countryName).stream().filter((attraction) -> attraction.getType() == attractionsType).collect(Collectors.toList());
	}
}
