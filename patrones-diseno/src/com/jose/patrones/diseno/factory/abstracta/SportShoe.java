package com.jose.patrones.diseno.factory.abstracta;

public class SportShoe implements Shoe {

	@Override
	public boolean isElengantShoes() {
		System.out.println("Zapato deportivo -> es elegante -> NO");
		return false;
	}

	@Override
	public boolean isRunningShoes() {
		System.out.println("Zapato deportivo -> Son para correr -> SI");
		return true;
	}

}
