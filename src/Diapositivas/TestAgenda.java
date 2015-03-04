package Diapositivas;

import java.util.Arrays;

public class TestAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto[] contactos = {new Contacto("manuel",111111),
				new Contacto("Luis",552545685),
				new Contacto("Nerea",5484157)};
		Agenda agenda = new Agenda(Arrays.asList(contactos));
		System.out.println("Agenda: "+agenda);
		Agenda agenda1 = new Agenda();
	//	agenda1 = agenda; eta logico que falle,porque apunta al mismo objeto que antes
		for (int i = 0; i < contactos.length; i++) {
			agenda1.addContacto(contactos[i]);
		}
		agenda1.addContacto(new Contacto("Jacinto",55555));
		System.out.println(agenda1);
		Contacto c1 = new Contacto("manuel",111111);
		agenda1.eliminarContacto(c1);
		System.out.println(agenda1);
		//actualizar un nombre
		//c1 = new Contacto("gabriel,11111");
		agenda1.actualizarNombre(c1,"Pedro");
		System.out.println(c1);
	
	}

}
