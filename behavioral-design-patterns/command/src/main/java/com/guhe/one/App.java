package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/9
 */
public class App {
	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		Goblin goblin = new Goblin();

		goblin.printStatus();
		wizard.castSpell(goblin::changeSize);
		wizard.castSpell(goblin::changeVisibility);
		wizard.undoLastSpell();
//		wizard.redoLastSpell();
		goblin.printStatus();
	}
}
