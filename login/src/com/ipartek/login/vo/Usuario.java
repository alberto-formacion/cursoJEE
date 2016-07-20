package com.ipartek.login.vo;

public class Usuario {

	private String usuario;
	private String contrasenya;
	
	public Usuario(String usuario, String contrasenya) {
		this.usuario = usuario;
		this.contrasenya = contrasenya;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

}
