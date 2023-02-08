package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
// 用一个常量类管理旅游相关的不变信息
public class TravelConstants {
	public enum CountryName {CHINA, USA, ENGLAND}

	public enum HotelStar {ONE, TWO, THREE, FOUR, FIVE}


	public enum AttractionsType {
		/**
		 * 游乐园
		 */
		AMUSEMENT,
		/**
		 * 景点
		 */
		SITE
	}
}
