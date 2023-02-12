package com.guhe.one;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author njl
 * @date 2023/2/12
 */
public class Wizard {
	private final Deque<Runnable> undoStack = new LinkedList<>();
	private final Deque<Runnable> redoStack = new LinkedList<>();

	public Wizard() {
	}

	public void castSpell(Runnable runnable) {
		runnable.run();
		undoStack.offerLast(runnable);
	}

	public void undoLastSpell() {
		if (!undoStack.isEmpty()) {
			Runnable previousSpell = undoStack.pollLast();
			redoStack.offerLast(previousSpell);
			previousSpell.run();
		}
	}

	public void redoLastSpell() {
		if (!redoStack.isEmpty()) {
			Runnable previousSpell = redoStack.pollLast();
			undoStack.offerLast(previousSpell);
			previousSpell.run();
		}
	}

	@Override
	public String toString() {
		return "Wizard";
	}
}
