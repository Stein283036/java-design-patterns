package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class WizardTowerProxy implements WizardTower {
	// 被代理对象
	private WizardTower wizardTower;

	private static final int NUM_WIZARDS_ALLOWED = 3;

	private int numWizards;

	public WizardTowerProxy(WizardTower wizardTower) {
		this.wizardTower = wizardTower;
	}

	@Override
	public void enter(Wizard wizard) {
		if (numWizards < NUM_WIZARDS_ALLOWED) {
			wizardTower.enter(wizard); // 委托给被代理对象
			numWizards++;
		} else {
			System.out.println(wizard.getName() + "is not allowed to enter the tower, only the first three ones");
		}
	}
}
