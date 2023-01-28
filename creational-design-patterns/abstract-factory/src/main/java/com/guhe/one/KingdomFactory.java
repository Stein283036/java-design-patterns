package com.guhe.one;

/**
 * 王国工厂
 *
 * @author njl
 * @date 2023/1/28
 */
public interface KingdomFactory {
	Castle createCastle();

	King createKing();

	Army createArmy();
}
