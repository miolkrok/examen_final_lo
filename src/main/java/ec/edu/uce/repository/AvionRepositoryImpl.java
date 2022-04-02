package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Avion;

@Repository
@Transactional
public class AvionRepositoryImpl implements IAvionRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarAvion(Avion avion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(avion);
	}

	@Override
	public void actualizarAvion(Avion avion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(avion);
	}

	@Override
	public Avion buscarAvionPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Avion.class, id);
	}

	@Override
	public void borrarAvionPorId(Integer id) {
		// TODO Auto-generated method stub
		Avion avi = this.buscarAvionPorId(id);
		this.entityManager.remove(avi);
	}

}
