package com.guhe.one;

import org.junit.Test;

/**
 * @author njl
 * @date 2023/1/17
 */
public class HeroFactoryImplTest {
	@Test
	public void testCreateMage() throws CloneNotSupportedException {
		HeroFactory heroFactory = new HeroFactoryImpl(
				new ElfMage("cooking"),
				new OrcBeast("cleaning"),
				new ElfWarlord("protecting")
		);
		Mage mage = heroFactory.createMage();
		Beast beast = heroFactory.createBeast();
		Warlord warloard = heroFactory.createWarloard();
		System.out.println("mage = " + mage);
		System.out.println("beast = " + beast);
		System.out.println("warloard = " + warloard);
	}
}
