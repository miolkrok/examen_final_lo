package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CompraPasaje;

@Repository
@Transactional
public class CompraPasajeRepositoryImpl implements ICompraPasajeRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCompraPasaje(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.entityManager.persist(compraPasaje);
	}

	@Override
	public void actualizarCompraPasaje(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.entityManager.merge(compraPasaje);
	}

	@Override
	public CompraPasaje buscarCompraPasajePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CompraPasaje.class, id);
	}

	@Override
	public void borrarCompraPasajePorId(Integer id) {
		// TODO Auto-generated method stub
		CompraPasaje compa = this.buscarCompraPasajePorId(id);
		this.entityManager.remove(compa);
	}

}