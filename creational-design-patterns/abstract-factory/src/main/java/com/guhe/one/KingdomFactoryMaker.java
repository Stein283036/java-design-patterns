package com.guhe.one;

/**
 * 抽象工厂 - 工厂的工厂
 *
 * @author njl
 * @date 2023/1/28
 */
public class KingdomFactoryMaker {
	public enum KingdomType {
		ELF, ORC
	}

	public static KingdomFactory makeKingdomFactory(KingdomType kingdomType) {
		switch (kingdomType) {
			case ELF:
				return new ElfKingdomFactory();
			case ORC:
				return new OrcKingdomFactory();
			default:
				throw new IllegalArgumentException("KingdomType not supported.");
		}
	}
}
