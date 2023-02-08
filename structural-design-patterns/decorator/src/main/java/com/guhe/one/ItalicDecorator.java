package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class ItalicDecorator extends TextNodeDecorator {

	public ItalicDecorator(TextNode textNode) {
		super(textNode);
	}

	@Override
	public String getText() {
		return "<em>" + target.getText() + "</em>";
	}
}
