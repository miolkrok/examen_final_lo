package ec.edu.uce.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.modelo.Vuelo;

@Transactional
@Rollback(true)
@SpringBootTest
class VueloServiceImplTest {
	
	@Autowired
	private IVueloService vueloService;

	@Test
	void testInsertarVuelo() {
		
		Vuelo vue = new Vuelo();
		vue.setNumeroVuelo("839");
		vue.setFechaVuelo(LocalDateTime.of(2022, Month.MAY,8,12,45));
		vue.setAsientosDisponibles(100);
		vue.setOrigen("ecuador");
		vue.setDestino("mexico");
		vue.setCategoria("E");
		vue.setValorAsiento(new BigDecimal(450));
		vue.setEstado("D");
		this.vueloService.insertarVuelo(vue);
		assertEquals("D", this.vueloService.buscarVueloPorId(1).getEstado());
	}

}
