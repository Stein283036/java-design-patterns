package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class SpanNode implements TextNode {
	private String text;

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String getText() {
		return "<span>" + text + "</span>";
	}
}
