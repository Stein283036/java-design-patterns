package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/28
 */
public class ElfArmy implements Army {
	private static final String ElfArmy_DESC = "This is the Elven Army!";

	@Override
	public String getDesc() {
		return ElfArmy_DESC;
	}
}
