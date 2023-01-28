package com.guhe.one;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @author njl
 * @date 2023/1/28
 */
@Data
@AllArgsConstructor
@Getter
public abstract class Computer {
	private String ram;
	private String hdd;
	private String cpu;
}
