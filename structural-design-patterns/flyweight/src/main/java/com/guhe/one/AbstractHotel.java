package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
// 一个国家有很多个酒店
public abstract class AbstractHotel {

	private String name;
	private Integer price;
	private TravelConstants.HotelStar star;

	public AbstractHotel(String name, Integer price, TravelConstants.HotelStar star) {
		this.name = name;
		this.price = price;
		this.star = star;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public TravelConstants.HotelStar getStar() {
		return star;
	}

	public void setStar(TravelConstants.HotelStar star) {
		this.star = star;
	}

	@Override
	public String toString() {
		return "AbstractHotel{" +
				"name='" + name + '\'' +
				", price=" + price +
				", star=" + star +
				'}';
	}
}
