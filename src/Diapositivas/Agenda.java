package Diapositivas;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Contacto> lista;
	
	//crea una agenda apartir de otra agenda
	public Agenda(List<Contacto> lista) {
		this.lista = lista;
	}
	//inicializa la agenda vacia
	public Agenda() {
		this.lista = new ArrayList<Contacto>();
	}
	public void addContacto(Contacto c){
		this.lista.add(c);
	}
	public boolean existeContacto(Contacto c){
		return this.lista.contains(c);
	}
	public void eliminarContacto(Contacto c){
		if(this.existeContacto(c));
		this.lista.remove(c);
	}
	public void actualizarTelefono(Contacto c,int telefono){
		if(this.existeContacto(c))
			c.setTelefono(telefono);//no funciona por temas de referencias
		for (Contacto contacto : lista) {
			if(lista.equals(contacto))
				contacto.setTelefono(telefono);
		}
	}
	public void actualizarNombre(Contacto c,String nombre){
		if(this.existeContacto(c))
			//c.setNombre(nombre); no funciona por temas de referecia
			for (Contacto contacto : lista) {
				if(lista.equals(contacto))
					contacto.setNombre(nombre);
			}
	}
	@Override
	public String toString() {
		return  this.lista.toString();
	}
}
