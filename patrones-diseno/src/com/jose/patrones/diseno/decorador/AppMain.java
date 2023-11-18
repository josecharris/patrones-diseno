package com.jose.patrones.diseno.decorador;

public class AppMain {
	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "Jos�");
		ICuentaBancaria cuentaAhorro = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuentaAhorro);
		
		cuentaBlindada.abrirCuenta(c);
		
	}
}
