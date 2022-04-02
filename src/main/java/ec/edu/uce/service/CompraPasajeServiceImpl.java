package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CompraPasaje;
import ec.edu.uce.repository.ICompraPasajeRepo;
@Service
public class CompraPasajeServiceImpl implements ICompraPasajeService{
	
	@Autowired
	private ICompraPasajeRepo compraPasajeRepo;

	@Override
	public void insertarCompraPasaje(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.compraPasajeRepo.insertarCompraPasaje(compraPasaje);
	}

	@Override
	public void actualizarCompraPasaje(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.compraPasajeRepo.actualizarCompraPasaje(compraPasaje);
	}

	@Override
	public CompraPasaje buscarCompraPasajePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.compraPasajeRepo.buscarCompraPasajePorId(id);
	}

	@Override
	public void borrarCompraPasajePorId(Integer id) {
		// TODO Auto-generated method stub
		this.compraPasajeRepo.borrarCompraPasajePorId(id);
	}

}
