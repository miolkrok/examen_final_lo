package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

import ec.edu.uce.modelo.Vuelo;

public interface IGestorClienteService {
	
	CompletableFuture<Vuelo> buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo);
	void reservarPasajesAereos(String numeroVuelo);

}
