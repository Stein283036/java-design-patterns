package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
// 装饰者需要持有一个被装饰者的引用 以此将核心功能委托给被装饰者来完成 而自己承担额外的责任完成额外其它的功能
public abstract class TextNodeDecorator implements TextNode {
	protected TextNode target; // 被装饰对象引用 可以是被装饰者 也可以是装饰者 因为装饰者实现了 TextNode 实现了多态

	public TextNodeDecorator(TextNode target) {
		this.target = target;
	}

	@Override
	public void setText(String text) {
		target.setText(text);
	}
}
