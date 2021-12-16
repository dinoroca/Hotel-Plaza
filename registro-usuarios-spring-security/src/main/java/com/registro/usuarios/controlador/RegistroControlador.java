package com.registro.usuarios.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.registro.usuarios.servicio.UsuarioServicio;

@Controller
public class RegistroControlador {

	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarUsuarios());
		return "indexlog";
	}
	@GetMapping("/login?admin")
	public String iniciarSesionAdmin() {
		return "loginAdmin";
	}

	@GetMapping("/admin")
	public String verPaginaAdmin(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarUsuarios());
		return "admin";
	}

	@GetMapping ("/inicio")
	public String verPaginaPrincipal() {
		return "index";
	}

	@GetMapping ("/nosotros")
	public String verPaginaNosotros() {
		return "nosotros";
	}

	@GetMapping ("/promociones")
	public String verPaginaPromociones() {
		return "promociones";
	}

	@GetMapping ("/restaurante")
	public String verPaginaRestaurante() {
		return "restaurante";
	}
}
