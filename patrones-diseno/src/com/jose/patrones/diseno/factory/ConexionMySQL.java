package com.jose.patrones.diseno.factory;

@SuppressWarnings("unused")
public class ConexionMySQL implements IConnection {
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		System.out.println("Conexi�n a BD");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconexi�n a BD");
		
	}
}
