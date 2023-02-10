package com.guhe.two;

/**
 * @author njl
 * @date 2023/2/10
 */
public class MeleeStrategy implements DragonSlayingStrategy {
	@Override
	public void execute() {
		System.out.println("With your Excalibur you sever the dragon's head!");
	}
}
