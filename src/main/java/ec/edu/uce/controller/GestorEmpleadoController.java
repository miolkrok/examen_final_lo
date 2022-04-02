package ec.edu.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.uce.modelo.CompraPasaje;
import ec.edu.uce.service.ICompraPasajeService;
import ec.edu.uce.service.IGestorEmpleadoService;

@Controller
@RequestMapping("/empleados/")
public class GestorEmpleadoController {
	
	@Autowired
	private IGestorEmpleadoService gestEmplServ;
	@Autowired
	private ICompraPasajeService comPasajeServ;
	
	@GetMapping("checkin/{numeroCompra}")
	public String obtenerCompraPasaje(@PathVariable("numeroCompra")String numeroCompra, CompraPasaje compraPasaje, Model modelo) {
		CompraPasaje copa = this.comPasajeServ.buscarCompraPasajePorNumero(numeroCompra);
		
		modelo.addAttribute("copa", copa);
	
		
		return "checkin";
	}
	
	@PutMapping("actualizar/{numeroCompra}")
	public String actualizarEstudiante(@PathVariable("idEstudiante")String numeroCompra, CompraPasaje compraPasaje) {
		compraPasaje.setNumeroCompra(numeroCompra);
		this.gestEmplServ.realizarCheckIn(numeroCompra);
		return "index";
	}
	

}
