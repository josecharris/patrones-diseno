package com.jose.patrones.diseno.singleton;

public class AppMain {
	public static void main(String[] args) {
		AppMain appMain = new AppMain();
		appMain.patronSigleton();
	}
	
	public void patronSigleton() {
		Connection conn = Connection.getInstance();
		conn.conectar();
		conn.desconectar();		
		System.out.println(conn instanceof Connection ? "Es una instancia de la clase Connection" : "No es una instancia de la clase Connection");
	}
}
