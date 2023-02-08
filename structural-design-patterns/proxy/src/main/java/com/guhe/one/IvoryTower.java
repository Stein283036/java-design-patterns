package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class IvoryTower implements WizardTower {
	@Override
	public void enter(Wizard wizard) {
		System.out.println(wizard + " enters the tower.");
	}
}
