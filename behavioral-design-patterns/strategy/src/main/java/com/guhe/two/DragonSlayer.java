package com.guhe.two;

/**
 * @author njl
 * @date 2023/2/10
 */
public class DragonSlayer {
	private DragonSlayingStrategy dragonSlayingStrategy;

	public DragonSlayer(DragonSlayingStrategy dragonSlayingStrategy) {
		this.dragonSlayingStrategy = dragonSlayingStrategy;
	}

	public void changeStrategy(DragonSlayingStrategy dragonSlayingStrategy) {
		this.dragonSlayingStrategy = dragonSlayingStrategy;
	}

	public void goToBattle() {
		dragonSlayingStrategy.execute();
	}
}
