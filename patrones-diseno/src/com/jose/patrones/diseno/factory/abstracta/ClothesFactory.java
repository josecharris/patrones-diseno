package com.jose.patrones.diseno.factory.abstracta;

public interface ClothesFactory {
	
	public Shoe createShoe();
	public Shirt createShirt();
	public Pant createPant();
	
}
