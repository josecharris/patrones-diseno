package com.jose.patrones.diseno.factory.abstracta;

public class GalaShirt implements Shirt {

	@Override
	public boolean hasLongSleeves() {
		System.out.println("Camisa de gala -> tiene mangas largas -> SI");
		return true;
	}

	@Override
	public boolean hasButtons() {
		System.out.println("Camisa de gala -> tiene botones -> SI");
		return true;
	}
	
}
