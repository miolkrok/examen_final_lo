package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vuelo;
import ec.edu.uce.repository.IVueloRepo;

@Service
public class VueloServiceImpl implements IVueloService{
	
	@Autowired
	private IVueloRepo vueloRepo;

	@Override
	public void insertarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.vueloRepo.insertarVuelo(vuelo);
	}

	@Override
	public void actualizarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.vueloRepo.actualizarVuelo(vuelo);
	}

	@Override
	public Vuelo buscarVueloPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.vueloRepo.buscarVueloPorId(id);
	}

	@Override
	public void borrarVueloPorId(Integer id) {
		// TODO Auto-generated method stub
		this.vueloRepo.borrarVueloPorId(id);
	}

}
