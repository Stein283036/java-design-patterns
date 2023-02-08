package com.guhe.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @author njl
 * @date 2023/2/8
 */
public abstract class LetterComposite {
	private final List<LetterComposite> children = new ArrayList<>();

	public void add(LetterComposite letter) {
		children.add(letter);
	}

	public int count() {
		return children.size();
	}

	protected void printThisBefore() {
	}

	protected void printTHisAfter() {
	}

	public void print() {
		printThisBefore();
		for (LetterComposite child : children) {
			child.print();
		}
//		children.forEach(LetterComposite::print);
		printTHisAfter();
	}


}
