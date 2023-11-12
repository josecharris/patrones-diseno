package com.jose.patrones.diseno.factory;

public class ConexionVacia implements IConnection {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFICÓ EL PROVEEDOR");
		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFICÓ EL PROVEEDOR");
		
	}

}
