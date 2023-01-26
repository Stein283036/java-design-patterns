package com.guhe.one;

import lombok.RequiredArgsConstructor;

/**
 * @author njl
 * @date 2023/1/17
 */
@RequiredArgsConstructor
public class HeroFactoryImpl implements HeroFactory {

	private final Mage mage;
	private final Beast beast;
	private final Warlord warlord;

	@Override
	public Mage createMage() throws CloneNotSupportedException {
		return mage.copy();
	}

	@Override
	public Beast createBeast() throws CloneNotSupportedException {
		return beast.copy();
	}

	@Override
	public Warlord createWarloard() throws CloneNotSupportedException {
		return warlord.copy();
	}
}
