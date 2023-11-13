package com.jose.patrones.diseno.factory.abstracta;

public class SportShirt implements Shirt {

	@Override
	public boolean hasLongSleeves() {
		System.out.println("Camisa deportiva -> tiene mangas largas -> NO");
		return false;
	}

	@Override
	public boolean hasButtons() {
		System.out.println("Camisa deportiva -> tiene botones -> NO");
		return false;
	}

}
