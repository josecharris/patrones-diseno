package com.jose.patrones.diseno.decorador;

public class CuentaCorriente implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta cuenta) {
		System.out.println("Cuenta corriente");
		
	}

}
