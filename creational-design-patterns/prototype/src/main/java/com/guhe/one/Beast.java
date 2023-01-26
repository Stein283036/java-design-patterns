package com.guhe.one;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author njl
 * @date 2023/1/17
 */
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class Beast extends Prototype<Beast> {
	public Beast(Beast source) {
	}
}
