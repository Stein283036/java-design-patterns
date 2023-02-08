package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public interface TextNode /* 需要被赋予额外责任的顶层接口(被装饰者) 类似于 InputStream */ {
	void setText(String text);

	String getText();
}
