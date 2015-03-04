package Diapositivas;

public class TestExterna {
	public static void main(String[] args) {
		Externa ex = new Externa();//creado objeto externa con referencia
		new Externa();//creado objeto externa sin referencia
		int numero1 = Externa.InternaEstatica.devuelveDos();
		System.out.println(Externa.InternaEstatica.devuelveDos());//creado objeto interna sin referencia
		System.out.println(numero1);
		int numero2 = Externa.devuelveOtroDos();
		System.out.println(numero2);
		//si esta dentro de otra clase
		int numero3 = ex.devuelveTres();
		System.out.println(numero3);
		int numero4 = (new Externa()).devuelveTres();
		System.out.println(numero4);
		Externa n = new Externa();
		System.out.println(n.devuelveTres());
		Externa.Interna x = (ex).new Interna();
		Externa.Interna x1 = new Externa().new Interna();
		System.out.println(x.devuelveOtroTres());
		System.out.println(x1.devuelveOtroTres());
		int numero5 = ex.metodoDeInstancia();
		System.out.println(numero5);

	}
}
class Externa{
	public Externa(){
		System.out.println("Creada un clase externa");
	}	
	public static int devuelveOtroDos(){
		return 2;
	}

	//clase interna estatica
	public static class InternaEstatica{
		public static int devuelveDos(){
			return 2;
		}
	}
	public int devuelveTres(){
		return 3;
	}
	//clase interna no estatica de instancia
	public class Interna{
		public int devuelveOtroTres(){
			return 3;
		}
	}
	public int metodoDeInstancia(){
		int x = 5;
		class Local{
			public int devuelveCuatro(){
				return 4;
			}
		}
		Local l = new Local();
		int numero = l.devuelveCuatro()+x;
			return numero;
	}
	{
		System.out.println("esto es un bloque anonimo");
		class LocalANivelDeBloque{
			public int devuelveCinco(){
				return 5;
			}
		}
		LocalANivelDeBloque l = new LocalANivelDeBloque();
		System.out.println(l.devuelveCinco());
	}
	
	static {
		System.out.println("esto es un bloque anonimo a nivel de clase");
	}
}
