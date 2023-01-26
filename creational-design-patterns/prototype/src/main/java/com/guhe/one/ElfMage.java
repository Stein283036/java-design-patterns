package com.guhe.one;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author njl
 * @date 2023/1/17
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class ElfMage extends Mage {
	private final String helpType;

	public ElfMage(ElfMage elfMage) {
		super(elfMage);
		this.helpType = elfMage.helpType;
	}

	@Override
	public String toString() {
		return "Elven mage helps in " + helpType;
	}
}
