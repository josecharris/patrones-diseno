package com.jose.patrones.diseno.factory.abstracta;

public class AppMain {
	public static void main(String[] args) {
		// Fabrica de ropa deportiva
		ClothesFactory sportClothesfactory = new SportClothesFactory();
		Shirt sportShirt = sportClothesfactory.createShirt();
		SportShoe sportShoe = (SportShoe) sportClothesfactory.createShoe();
		Pant sportPant = sportClothesfactory.createPant();
		
		System.out.println(" --- EJEMPLO DE ROPA DEPORTIVA --- ");
		sportShirt.hasButtons();
		sportShoe.isElengantShoes();
		sportPant.getClosureTipe();
	}
}
