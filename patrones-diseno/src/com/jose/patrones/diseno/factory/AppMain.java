package com.jose.patrones.diseno.factory;

public class AppMain {
	public static void main(String[] args) {
		ConexionFabrica fabrica = new ConexionFabrica();
		IConnection conn = fabrica.getConnection(null);
		conn.conectar();
		conn.desconectar();
		
		System.out.println();
		conn = fabrica.getConnection("oracle");
		conn.conectar();
		conn.desconectar();
		
		System.out.println();
		conn = fabrica.getConnection("h2");
		conn.conectar();
		conn.desconectar();
	}
}
