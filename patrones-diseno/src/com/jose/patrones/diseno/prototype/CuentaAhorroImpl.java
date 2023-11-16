package com.jose.patrones.diseno.prototype;

public class CuentaAhorroImpl implements ICuenta {
	
	private String tipo;
	private double monto;

	public CuentaAhorroImpl() {
		this.tipo = "AHORRO";
	}
	
	@Override
	public ICuenta clonar() {
		CuentaAhorroImpl cuenta = null;
		try {
			cuenta = (CuentaAhorroImpl) clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cuenta;
	}

	@Override
	public String toString() {
		return "CuentaAhorroImpl [tipo=" + tipo + ", monto=" + monto + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

}
