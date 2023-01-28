package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/28
 */
public class OrcArmy implements Army {
	private static final String OrcArmy_DECSC = "This is the Orc army!";

	@Override
	public String getDesc() {
		return OrcArmy_DECSC;
	}
}
