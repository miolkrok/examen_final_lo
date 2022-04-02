package ec.edu.uce.service;

import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.modelo.Avion;

@Transactional
@Rollback(true)
@SpringBootTest
class AvionServiceImplTest {
	@Autowired
	private IAvionService avionService;

	@Test
	void testInsertarAvion() {
		Avion avi = new Avion();
		avi.setCapacidadAsientos(100);
		avi.setNombreAvion("coloso");
		this.avionService.insertarAvion(avi);
		assertEquals("coloso", this.avionService.buscarAvionPorId(2).getNombreAvion());
	}

}
