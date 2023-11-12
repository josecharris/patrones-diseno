package com.jose.patrones.diseno.factory;

import java.util.Objects;

public class ConexionFabrica {
	public IConnection getConnection(String motor) {
		if(Objects.isNull(motor)) {
			return new ConexionVacia();
		}
		switch(motor.toUpperCase()) {
			case "MYSQL":
				return new ConexionMySQL();
			case "ORACLE":
				return new ConexionOracle();
			case "POSTGRESQL":
				return new ConexionPostgreSQL();
			case "SQL":
				return new ConexionSqlServer();
		}
		return new ConexionVacia();
	}
}
