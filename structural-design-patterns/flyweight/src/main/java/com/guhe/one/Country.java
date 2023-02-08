package com.guhe.one;

import java.util.List;

/**
 * @author njl
 * @date 2023/2/8
 */
// 一个人去一个国家旅游 比如说中国
public abstract class Country {
	private String name; // 国家名称
	// 组合景点集合和酒店集合
	private List<AbstractAttractions> attractions;
	private List<AbstractHotel> hotels;

	public Country(String name, List<AbstractAttractions> attractions, List<AbstractHotel> hotels) {
		this.name = name;
		this.attractions = attractions;
		this.hotels = hotels;
	}

	public List<AbstractAttractions> getAttractions() {
		return attractions;
	}

	public void setAttractions(List<AbstractAttractions> attractions) {
		this.attractions = attractions;
	}

	public List<AbstractHotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<AbstractHotel> hotels) {
		this.hotels = hotels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country{" +
				"name='" + name + '\'' +
				", attractions=" + attractions +
				", hotels=" + hotels +
				'}';
	}
}
