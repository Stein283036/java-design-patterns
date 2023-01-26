package com.guhe.one;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author njl
 * @date 2023/1/17
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class ElfWarlord extends Warlord {
	private final String helpType;

	public ElfWarlord(ElfWarlord elfWarlord) {
		super(elfWarlord);
		this.helpType = elfWarlord.helpType;
	}

	@Override
	public String toString() {
		return "Elven warlord helps in " + helpType;
	}
}
