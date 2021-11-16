package com.patron.builder;

public class Persona 
{
	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
		//System.out.println("Mi nombre es: " + this.nombre);
	}
	
	public Persona()
	{
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
