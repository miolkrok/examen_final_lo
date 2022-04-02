package ec.edu.uce.repository;

import ec.edu.uce.modelo.CompraPasaje;

public interface ICompraPasajeRepo {

	void insertarCompraPasaje(CompraPasaje compraPasaje);
	void actualizarCompraPasaje(CompraPasaje compraPasaje);
	CompraPasaje buscarCompraPasajePorId(Integer id);
	void borrarCompraPasajePorId(Integer id);
	
}
