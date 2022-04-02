package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vuelo;
@Service
public class GestorClienteServiceImpl implements IGestorClienteService{

	@Autowired
	private IVueloService vueloService;
	
	
	@Override
	@Async
	public CompletableFuture<Vuelo> buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void reservarPasajesAereos(String numeroVuelo) {
		// TODO Auto-generated method stub
		
	}

}
