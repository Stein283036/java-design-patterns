package com.guhe.one;

import lombok.ToString;

/**
 * @author njl
 * @date 2023/1/28
 */
@ToString(callSuper = true)
public class PC extends Computer {
	public PC(String ram, String hdd, String cpu) {
		super(ram, hdd, cpu);
	}
}
