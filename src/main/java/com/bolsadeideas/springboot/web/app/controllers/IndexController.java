package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${indexcontroller.titulo.getpage}")
	private String tituloGetPage;
	
	@Value("${indexcontroller.titulo.datos-perfil}")
	private String tituloDatosPerfil;
	
	@Value("${indexcontroller.titulo.listar-perfiles}")
	private String tituloListarPerfiles;
	
	@GetMapping("/getpage")
	public String index(Model model) {
		
		model.addAttribute("titulo", tituloGetPage);
		return "index";
	}
	
	@GetMapping("/datos-perfil")
	public String perfil(Model model) throws Exception{
		
		Usuario usuario = new Usuario("Duber", "Galvis", "");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", tituloDatosPerfil.concat(usuario.getNombre()));
		
		return "perfil";
	}
	
	@GetMapping("/listar-perfiles")
	public String listar(Model model) throws Exception{
		
		model.addAttribute("titulo", tituloListarPerfiles);
		
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() throws Exception{
		
		List<Usuario> usuarios = Arrays.asList(new Usuario("Benjita", "Galvis", "benjita@email.com"),
				new Usuario("Celeste", "Galvis", "celeste@email.com"),
				new Usuario("Elem", "Galvis", "elem@email.com"),
				new Usuario("Kata", "Amaya", "kata@email.com"));
		
		return usuarios;
	}
}
