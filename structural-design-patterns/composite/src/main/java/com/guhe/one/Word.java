package com.guhe.one;

import java.util.List;

/**
 * @author njl
 * @date 2023/2/8
 */
public class Word extends LetterComposite {
	public Word(List<LetterComposite> letters) {
		letters.forEach(this::add); // 实例方法引用
	}

	public Word(char... chars) {
		for (char c : chars) {
			this.add(new Letter(c));
		}
	}

	@Override
	protected void printThisBefore() {
		System.out.print(" ");
	}
}
