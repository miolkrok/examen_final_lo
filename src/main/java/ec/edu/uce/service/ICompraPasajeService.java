package ec.edu.uce.service;

import ec.edu.uce.modelo.CompraPasaje;

public interface ICompraPasajeService {
	
	void insertarCompraPasaje(CompraPasaje compraPasaje);
	void actualizarCompraPasaje(CompraPasaje compraPasaje);
	CompraPasaje buscarCompraPasajePorId(Integer id);
	void borrarCompraPasajePorId(Integer id);

}
