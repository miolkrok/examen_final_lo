package ec.edu.uce.service;

import java.time.LocalDateTime;

import ec.edu.uce.modelo.Vuelo;

public interface IGestorClienteService {
	
	Vuelo buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo);
	void reservarPasajesAereos(String numeroVuelo);

}
