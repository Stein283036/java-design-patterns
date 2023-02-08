package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class BoldDecorator extends TextNodeDecorator {

	public BoldDecorator(TextNode textNode) {
		super(textNode);
	}

	@Override
	public String getText() {
		return "<b>" + target.getText() + "</b>";
	}
}
