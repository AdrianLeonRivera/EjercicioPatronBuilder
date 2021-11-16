package com.patron.singleton;

public class Main {

	public static void main(String[] args) {
		
		Persona juan=Persona.getSingletonInstance("Juan Perez Garcia");
		Persona maria=Persona.getSingletonInstance("Maria Gomez Ruiz");
		
		System.out.println(juan.getNombre());
		System.out.println(maria.getNombre());

	}

}
