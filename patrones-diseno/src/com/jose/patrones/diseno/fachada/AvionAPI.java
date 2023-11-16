package com.jose.patrones.diseno.fachada;

public class AvionAPI {
	
	public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino){
		System.out.println("=====================");
		System.out.println("Vuelos encontrados para " + destino + " desde " + origen);
		System.out.println("Fecha de IDA: " + fechaIda + " Fecha vuelta: " + fechaVuelta);
		System.out.println("=====================");
	}
}
