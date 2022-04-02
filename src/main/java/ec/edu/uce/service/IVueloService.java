package ec.edu.uce.service;

import ec.edu.uce.modelo.Vuelo;

public interface IVueloService {
	
	
	void insertarVuelo(Vuelo vuelo);
	void actualizarVuelo(Vuelo vuelo);
	Vuelo buscarVueloPorId(Integer id);
	void borrarVueloPorId(Integer id);

}
