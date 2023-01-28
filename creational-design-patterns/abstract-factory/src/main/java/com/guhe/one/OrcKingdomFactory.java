package com.guhe.one;

/**
 * 兽人王国工厂
 *
 * @author njl
 * @date 2023/1/28
 */
public class OrcKingdomFactory implements KingdomFactory {
	@Override
	public Castle createCastle() {
		return new OrcCastle();
	}

	@Override
	public King createKing() {
		return new OrcKing();
	}

	@Override
	public Army createArmy() {
		return new OrcArmy();
	}
}
