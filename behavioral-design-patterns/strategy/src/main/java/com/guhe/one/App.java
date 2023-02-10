package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public class App {
	public static void main(String[] args) {
		// 定义一个家族算法，并封装好其中每一个，使它们可以互相替换。策略模式使算法的变化独立于使用它的客户。
		DrawContext drawContext = new DrawContext(new BluePenDrawStrategy());

		drawContext.executeDraw(5, 10, 20);

		// 改变算法的策略
		drawContext.setDrawStrategy(new RedPenDrawStrategy());
		drawContext.executeDraw(1, 2, 3);

		drawContext.setDrawStrategy(new GreenPenDrawStrategy());
		drawContext.executeDraw(3, 4, 5);
	}
}
