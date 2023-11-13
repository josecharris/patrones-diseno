package com.jose.patrones.diseno.factory.abstracta;

public interface Pant {
	/** Determina si el pantalón tiene bolsillos */
	boolean hasPockets();
	
	/** Determina el tipo de cierre o cremallera */
	String getClosureTipe();
}
