package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/28
 */
public class App {
	public static void main(String[] args) {
		// 创建精灵王国工厂
		KingdomFactory elfKingdomFactory = KingdomFactoryMaker.makeKingdomFactory(KingdomFactoryMaker.KingdomType.ELF);
		// 创建精灵王国
		Castle elfCastle = elfKingdomFactory.createCastle(); // 城堡
		King elfKing = elfKingdomFactory.createKing(); // 国王
		Army elfArmy = elfKingdomFactory.createArmy(); // 军队
		System.out.println(elfCastle.getDesc());
		System.out.println(elfKing.getDesc());
		System.out.println(elfArmy.getDesc());

		// 创建兽人王国工厂
		KingdomFactory orcKingdomFactory = KingdomFactoryMaker.makeKingdomFactory(KingdomFactoryMaker.KingdomType.ORC);
		// 创建兽人王国
		Castle orcCastle = orcKingdomFactory.createCastle();
		King orgKing = orcKingdomFactory.createKing();
		Army orcArmy = orcKingdomFactory.createArmy();
		System.out.println(orcCastle.getDesc());
		System.out.println(orgKing.getDesc());
		System.out.println(orcArmy.getDesc());
	}
}
