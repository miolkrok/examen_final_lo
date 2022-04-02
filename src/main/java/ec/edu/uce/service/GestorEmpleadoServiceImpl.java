package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CompraPasaje;

@Service
public class GestorEmpleadoServiceImpl implements IGestorEmpleadoService{
	
	@Autowired
	private ICompraPasajeService compraService;

	@Override
	public void realizarCheckIn(String numeroCompra) {
		// TODO Auto-generated method stub
		CompraPasaje cop = this.compraService.buscarCompraPasajePorNumero(numeroCompra);
		cop.setEstado("I");
		this.compraService.actualizarCompraPasaje(cop);
	}

	
}
