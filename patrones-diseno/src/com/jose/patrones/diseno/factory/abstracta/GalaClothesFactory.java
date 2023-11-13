package com.jose.patrones.diseno.factory.abstracta;

public class GalaClothesFactory implements ClothesFactory {

	@Override
	public Shoe createShoe() {
		return new GalaShoe();
	}

	@Override
	public Shirt createShirt() {
		return new GalaShirt();
	}

	@Override
	public Pant createPant() {
		return new GalaPants();
	}

}
