package com.jose.patrones.diseno.prototype;

public class App {
	public static void main(String[] args) {
		CuentaAhorroImpl cuenta = new CuentaAhorroImpl();
		cuenta.setMonto(200);
		CuentaAhorroImpl cuentaClonada = (CuentaAhorroImpl) cuenta.clonar();
		if(cuentaClonada != null) {
			System.out.println(cuentaClonada);
		}
		System.out.println(cuentaClonada == cuenta);
	}
}
