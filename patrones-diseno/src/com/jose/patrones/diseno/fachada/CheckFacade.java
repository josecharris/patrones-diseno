package com.jose.patrones.diseno.fachada;

public class CheckFacade {
	
	private AvionAPI avionAPI;
	private HotelAPI hotelAPI;
	
	private static CheckFacade checkFacade;
	
	private CheckFacade( ) {
		this.avionAPI = new AvionAPI();
		this.hotelAPI = new HotelAPI();
	}
	
	public static CheckFacade getInstance() {
		return (checkFacade != null) ? checkFacade: new CheckFacade();
	}
	
	public void buscar(String fechaEntrada, String fechaSalida, String origen, String destino) {
		this.avionAPI.buscarVuelos(fechaEntrada, fechaSalida, origen, destino);
		this.hotelAPI.buscarHotel(fechaEntrada, fechaSalida, origen, destino);
	}
	
}
