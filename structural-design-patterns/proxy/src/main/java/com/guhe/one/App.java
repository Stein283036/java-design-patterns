package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class App {
	public static void main(String[] args) {
		// 这个例子是静态代理
		WizardTower wizardTowerProxy = new WizardTowerProxy(new IvoryTower());
		wizardTowerProxy.enter(new Wizard("Gandalf"));
		wizardTowerProxy.enter(new Wizard("Orchid"));
		wizardTowerProxy.enter(new Wizard("WhiteWood"));
		wizardTowerProxy.enter(new Wizard("BlackMagic"));
		wizardTowerProxy.enter(new Wizard("Gulu"));
	}
}
