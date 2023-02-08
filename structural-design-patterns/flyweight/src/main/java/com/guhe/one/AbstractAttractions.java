package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
// 一个国家有很多个旅游景点
public abstract class AbstractAttractions {
	private String name;
	private Integer price;

	private TravelConstants.AttractionsType type;

	public AbstractAttractions(String name, Integer price, TravelConstants.AttractionsType type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public TravelConstants.AttractionsType getType() {
		return type;
	}

	public void setType(TravelConstants.AttractionsType type) {
		this.type = type;
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

	@Override
	public String toString() {
		return "AbstractAttractions{" +
				"name='" + name + '\'' +
				", price=" + price +
				", type=" + type +
				'}';
	}
}
