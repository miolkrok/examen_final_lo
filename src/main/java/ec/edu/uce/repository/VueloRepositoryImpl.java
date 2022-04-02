package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vuelo;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vuelo);
	}

	@Override
	public void actualizarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vuelo);
	}

	@Override
	public Vuelo buscarVueloPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vuelo.class, id);
	}

	@Override
	public void borrarVueloPorId(Integer id) {
		// TODO Auto-generated method stub
		Vuelo vue = this.buscarVueloPorId(id);
		this.entityManager.remove(vue);
	}

}
