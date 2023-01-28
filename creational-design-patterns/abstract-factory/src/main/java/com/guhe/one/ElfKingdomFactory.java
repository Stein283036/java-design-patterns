package com.guhe.one;

/**
 * 精灵王国工厂
 *
 * @author njl
 * @date 2023/1/28
 */
public class ElfKingdomFactory implements KingdomFactory{
	@Override
	public Castle createCastle() {
		return new ElfCastle();
	}

	@Override
	public King createKing() {
		return new ElfKing();
	}

	@Override
	public Army createArmy() {
		return new ElfArmy();
	}
}
