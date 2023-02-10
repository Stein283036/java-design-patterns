package com.guhe.two;

/**
 * @author njl
 * @date 2023/2/10
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Green dragon spotted ahead!");
		DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
		dragonSlayer.goToBattle();
		System.out.println("Red dragon emerges.");
		dragonSlayer.changeStrategy(new ProjectileStrategy());
		dragonSlayer.goToBattle();
		System.out.println("Black dragon lands before you.");
		dragonSlayer.changeStrategy(new SpellStrategy());
		dragonSlayer.goToBattle();
	}
}
