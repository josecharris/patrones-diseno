package com.jose.patrones.diseno.factory.abstracta;

public class GalaShoe implements Shoe {

	@Override
	public boolean isElengantShoes() {
		System.out.println("Zapatos de gala -> es elegante -> SI");
		return false;
	}

	@Override
	public boolean isRunningShoes() {
		System.out.println("Zapatos de gala -> para correr -> NO");
		return true;
	}

}
