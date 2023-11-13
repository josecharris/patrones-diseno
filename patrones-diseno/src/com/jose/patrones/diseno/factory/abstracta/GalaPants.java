package com.jose.patrones.diseno.factory.abstracta;

public class GalaPants implements Pant {

	@Override
	public boolean hasPockets() {
		System.out.println("Pantalones de gala -> Tienen bolsillos -> SI");
		return true;
	}

	@Override
	public String getClosureTipe() {
		System.out.println("Pantalones de gala -> Tienen cierres -> Cremallera");
		return "Cremallera";
	}

}
