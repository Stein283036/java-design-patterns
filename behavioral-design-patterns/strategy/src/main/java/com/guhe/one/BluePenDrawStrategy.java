package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public class BluePenDrawStrategy implements DrawStrategy {
	@Override
	public void draw(int radius, int x, int y) {
		System.out.printf("BluePenDrawStrategy radius = %d, x = %d, y = %d", radius, x, y);
	}
}
