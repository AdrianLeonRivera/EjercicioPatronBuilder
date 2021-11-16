package com.patron.builder;

public class PersonaBuilder 
{
	private String nombre;

	public PersonaBuilder(String nombre) {
		this.nombre = nombre;
		//System.out.println("Mi nombre es: " + this.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public PersonaBuilder withNombre(String nombre)
	{
		this.nombre=nombre;
		return this;
	}
	public Persona build()
	{
		Persona persona=new Persona();
		persona.setNombre(this.nombre);
		return persona;
	}
}
