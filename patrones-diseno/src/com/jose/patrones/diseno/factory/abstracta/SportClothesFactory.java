package com.jose.patrones.diseno.factory.abstracta;

public class SportClothesFactory implements ClothesFactory {

	@Override
	public Shoe createShoe() {
		return new SportShoe();
	}

	@Override
	public Shirt createShirt() {
		return new SportShirt();
	}

	@Override
	public Pant createPant() {
		return new SportPants();
	}

}
