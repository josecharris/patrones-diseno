package com.jose.patrones.diseno.factory;

@SuppressWarnings("unused")
public class ConexionOracle implements IConnection {
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		System.out.println("Conexi�n a BD Oracle");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconexi�n a BD Oracle");
		
	}
}
