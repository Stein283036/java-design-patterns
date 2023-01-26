package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/17
 */
public interface HeroFactory {
	Mage createMage() throws CloneNotSupportedException;

	Beast createBeast() throws CloneNotSupportedException;

	Warlord createWarloard() throws CloneNotSupportedException;
}
