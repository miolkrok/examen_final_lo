package ec.edu.uce.service;

import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.modelo.Cliente;

@Transactional
@Rollback(true)
@SpringBootTest
class ClienteServiceImplTest {
	
	@Autowired
	private IClienteService clienteService;

	@Test
	void testInsertarCliente() {
		Cliente clie = new Cliente();
		clie.setNombre("Luis");
		clie.setApellido("Ortiz");
		clie.setCedula("1718496944");
		this.clienteService.insertarCliente(clie);
		assertEquals("1718496944", this.clienteService.buscarClientePorId(1).getCedula());
	}

}
