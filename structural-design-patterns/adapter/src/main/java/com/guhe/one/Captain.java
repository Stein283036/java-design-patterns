package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/28
 */
public class Captain {
	private final RowingBoat rowingBoat;

	public Captain(RowingBoat rowingBoat) {
		this.rowingBoat = rowingBoat;
	}

	public void row() {
		rowingBoat.row();
	}
}
