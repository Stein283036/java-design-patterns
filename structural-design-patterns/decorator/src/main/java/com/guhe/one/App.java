package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class App {
	public static void main(String[] args) {
		TextNode spanNode = new SpanNode();
		spanNode.setText("Hello Decorator");
		String spanNodeText = spanNode.getText();
		BoldDecorator boldDecorator = new BoldDecorator(spanNode);
		String boldDecoratorText = boldDecorator.getText();
		System.out.println("boldDecoratorText = " + boldDecoratorText);
		ItalicDecorator italicDecorator = new ItalicDecorator(boldDecorator); // 此时被装饰者本身也是一个装饰者
		// 下面这行代码一定要配合断点调试查看调用过程 里面还涉及了递归调用返回
		String italicDecoratorText = italicDecorator.getText();
		System.out.println("italicDecoratorText = " + italicDecoratorText);
	}
}
