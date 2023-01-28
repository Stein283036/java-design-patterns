package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/28
 */
public class ElfKing implements King {
	private static final String ElfKing_DESC = "This is the Elven king!";

	@Override
	public String getDesc() {
		return ElfKing_DESC;
	}
}
