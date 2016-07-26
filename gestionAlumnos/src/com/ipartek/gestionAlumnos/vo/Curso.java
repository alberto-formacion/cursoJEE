package com.ipartek.gestionAlumnos.vo;

public class Curso {

	private int id;
	private String nombre;
	private String descripcion;
	private String duracion;
	
	public Curso(int id, String nombre, String descripcion, String duracion) {
		super();
		this.setId(id);
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.duracion = duracion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
