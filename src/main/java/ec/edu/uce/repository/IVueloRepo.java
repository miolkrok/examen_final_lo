package ec.edu.uce.repository;

import ec.edu.uce.modelo.Vuelo;

public interface IVueloRepo {
	
	void insertarVuelo(Vuelo vuelo);
	void actualizarVuelo(Vuelo vuelo);
	Vuelo buscarVueloPorId(Integer id);
	void borrarVueloPorId(Integer id);
	Vuelo buscarVueloPorEstado(String estado);

}
