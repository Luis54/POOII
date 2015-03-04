package Diapositivas;

import java.util.ArrayList;
import java.util.List;

public class TestClaseParametrizada {
	public static void main(String[] args) {
		///creamos clase parametrizada a dobule
		Parametrizada<Double> listadouble = new Parametrizada();
		for (int i = 0; i < 10; i++) {
			listadouble.addLista((new Double(i)));
		}
		Double valor = listadouble.devuelveObjetoPosicion((int) (Math.random()*10));
		System.out.println(valor);
		System.out.println(listadouble.devuelveObjetoPosicion(11));
		Parametrizada<String> listastring = new Parametrizada();
		for (int i = 0; i < 10; i++) {
			listastring.addLista((new String("Palabra "+i)));
		}
		String valorS = listastring.devuelveObjetoPosicion((int) (Math.random()*10));
		System.out.println(valorS);
	}
}
class Parametrizada<T>{
	List<T> lista ;
	public Parametrizada(){
		lista = new ArrayList<T>();
		
	}
	public void addLista(T e){
		lista.add(e);
	}
	public T devuelveObjetoPosicion(int i){
		if(i < this.lista.size())
		return this.lista.get(i);
		else{
			return null;
		}
	}
	
}
