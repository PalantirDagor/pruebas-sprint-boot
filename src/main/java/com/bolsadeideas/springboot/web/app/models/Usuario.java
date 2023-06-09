package com.bolsadeideas.springboot.web.app.models;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario() {
		
	}

	public Usuario(String nombre, String apellido, String email) throws Exception {
		
		validarNombre(nombre);
		validarApellido(apellido);
		setNombre(nombre);
		setApellido(apellido);
		setEmail(email);
	}
	
	private void validarNombre(String nombre) throws Exception {
		
		if(nombre.isEmpty()) {
			
			throw new Exception("el Nombre no contiene caracteres");
		}
	}
	
	private void validarApellido(String apellido) throws Exception {
		
		if(apellido.isEmpty()) {
			
			throw new Exception("el Apellido no contiene caracteres");
		}
	}
	
	private void validarEmail(String email) throws Exception {
		
		if(email.isEmpty()) {
			
			throw new Exception("el Email no contiene caracteres");
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}
}
