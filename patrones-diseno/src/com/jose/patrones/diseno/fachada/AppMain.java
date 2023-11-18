package com.jose.patrones.diseno.fachada;

public class AppMain {

	public static void main(String[] args) {
		CheckFacade cliente1 = CheckFacade.getInstance();
		cliente1.buscar("02/07/2018", "08/07/2018", "Lima", "Cancún");
		
		CheckFacade cliente2 = CheckFacade.getInstance();
		cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Quito");
	}

}
