package com.guhe.one;

import java.util.Arrays;
import java.util.List;

/**
 * @author njl
 * @date 2023/2/8
 */
public class App {
	public static void main(String[] args) {
		List<Word> words = Arrays.asList(
				new Word('W', 'h', 'e', 'r', 'e'),
				new Word('t', 'h', 'e', 'r', 'e'),
				new Word('i', 's'),
				new Word('a'),
				new Word('w', 'h', 'i', 'p'),
				new Word('t', 'h', 'e', 'r', 'e'),
				new Word('i', 's'),
				new Word('a'),
				new Word('w', 'a', 'y')
		);
		Sentence sentence = new Sentence(words);
		sentence.print();
	}
}
