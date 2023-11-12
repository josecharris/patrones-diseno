package com.jose.patrones.diseno.singleton;

public class Connection {
	
	/** Atributo que determina la declaraci�n de la instancia */
	private static Connection conn;
	
	private Connection() {
		/* Constructor vac�o de la clase*/
	}
	
	/**
	 * <b>Descripci�n: </b>Se obtiene la instancia de la clase solamente por este m�todo
	 * @author jcharris
	 */
	public static Connection getInstance() {
		return conn != null ? conn : new Connection();
	}
	
	public void conectar() {
		System.out.println("Se realiza la conexi�n.");
	}
	
	public void desconectar() {
		System.out.println("Se realiza la desconexi�n.");
	}
	
}
