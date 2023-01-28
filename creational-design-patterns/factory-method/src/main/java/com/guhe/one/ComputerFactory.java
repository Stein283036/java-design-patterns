package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/28
 */
public class ComputerFactory {
	private ComputerFactory() {
	}

	public static Computer makeComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equals(type)) {
			return new PC(ram, hdd, cpu);
		} else if ("Server".equals(type)) {
			return new Server(ram, hdd, cpu);
		}
		return null;
	}
}
