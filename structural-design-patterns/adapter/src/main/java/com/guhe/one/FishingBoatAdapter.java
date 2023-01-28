package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/28
 */
public class FishingBoatAdapter implements RowingBoat {
	private final FishingBoat fishingBoat;

	public FishingBoatAdapter() {
		this.fishingBoat = new FishingBoat();
	}

	@Override
	public void row() {
		fishingBoat.sail();
	}
}
