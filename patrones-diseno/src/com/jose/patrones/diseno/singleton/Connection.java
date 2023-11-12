package com.jose.patrones.diseno.singleton;

public class Connection {
	
	/** Atributo que determina la declaración de la instancia */
	private static Connection conn;
	
	private Connection() {
		/* Constructor vacío de la clase*/
	}
	
	/**
	 * <b>Descripción: </b>Se obtiene la instancia de la clase solamente por este método
	 * @author jcharris
	 */
	public static Connection getInstance() {
		return conn != null ? conn : new Connection();
	}
	
	public void conectar() {
		System.out.println("Se realiza la conexión.");
	}
	
	public void desconectar() {
		System.out.println("Se realiza la desconexión.");
	}
	
}
