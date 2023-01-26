package com.guhe.one;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author njl
 * @date 2023/1/17
 */
@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor
public class OrcBeast extends Beast {
	private final String weapon;

	public OrcBeast(OrcBeast orcBeast) {
		super(orcBeast);
		this.weapon = orcBeast.weapon;
	}

	@Override
	public String toString() {
		return "Orcish wolf attacks with " + weapon;
	}
}
