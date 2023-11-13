package com.jose.patrones.diseno.factory.abstracta;

public class SportPants implements Pant {

	@Override
	public boolean hasPockets() {
		System.out.println("Pantalones deportivos -> tiene bolsillos -> NO");
		return false;
	}

	@Override
	public String getClosureTipe() {
		System.out.println("Pantalones deportivos -> tiene cierre -> Sin cierre");
		return "Sin cierre";
	}

}
