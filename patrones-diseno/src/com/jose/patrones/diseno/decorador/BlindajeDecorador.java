package com.jose.patrones.diseno.decorador;

public class BlindajeDecorador extends CuentaDecorador{

	public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}
	
	@Override
	public void abrirCuenta(Cuenta c) {
		cuentaDecorada.abrirCuenta(c);
		agregarBlindaje(c);
	}
	
	public void agregarBlindaje(Cuenta c) {
		System.out.println("Se agregó el blindaje a la cuenta cliente " + c.getCliente());
	}

}
