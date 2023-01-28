package com.guhe.one;

/**
 * 精灵城堡
 *
 * @author njl
 * @date 2023/1/28
 */
public class ElfCastle implements Castle {
	private static final String ElfCastle_DESC = "This is the Elven castle!";

	@Override
	public String getDesc() {
		return ElfCastle_DESC;
	}
}
