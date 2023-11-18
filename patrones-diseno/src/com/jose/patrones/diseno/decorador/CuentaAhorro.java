package com.jose.patrones.diseno.decorador;

public class CuentaAhorro implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta cuenta) {
		System.out.println("Cuenta ahorro");
		
	}

}
