package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/12
 */
public class Goblin extends Target {

	public Goblin() {
		setSize(Size.NORMAL);
		setVisibility(Visibility.VISIBLE);
	}

	@Override
	public String toString() {
		return "Goblin";
	}

	public void changeSize() {
		Size newSize = getSize() == Size.NORMAL ? Size.SMALL : Size.NORMAL;
		setSize(newSize);
	}

	public void changeVisibility() {
		Visibility newVisibility = getVisibility() == Visibility.VISIBLE ? Visibility.INVISIBLE : Visibility.VISIBLE;
		setVisibility(newVisibility);
	}
}
