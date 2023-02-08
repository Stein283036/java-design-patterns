package com.guhe.one;

import java.util.List;

/**
 * @author njl
 * @date 2023/2/8
 */
public class Sentence extends LetterComposite {
	public Sentence(List<Word> words) {
		words.forEach(this::add);
	}

	@Override
	protected void printTHisAfter() {
		System.out.print(".");

	}
}
