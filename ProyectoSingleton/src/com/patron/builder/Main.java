package com.patron.builder;

public class Main {

	public static void main(String[] args) {
		
		PersonaBuilder builder=new PersonaBuilder("Juan Martinez");
		
		PersonaBuilder p=builder.withNombre("Pedro Martinez");
		
		System.out.println(p);

	}
	
}
