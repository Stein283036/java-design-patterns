package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public class DrawContext {
	private DrawStrategy drawStrategy;

	public DrawStrategy getDrawStrategy() {
		return drawStrategy;
	}

	public void setDrawStrategy(DrawStrategy drawStrategy) {
		this.drawStrategy = drawStrategy;
	}

	public DrawContext(DrawStrategy drawStrategy) {
		this.drawStrategy = drawStrategy;
	}

	public void executeDraw(int radius, int x, int y) {
		drawStrategy.draw(radius, x, y);
	}
}
