package Diapositivas;



public class InstanciaEstatico {
	public final int CONSTANTE= 5;
	public static final int OTRA_CONSTANTE=7;
	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado(10);
		System.out.println("valor de la arista: "+c1.getArista());
		System.out.println("número de cuadrados "+Cuadrado.getNumeroCuadrados());
		System.out.println("Valor deee la otra connstante "+OTRA_CONSTANTE);
		InstanciaEstatico i = new InstanciaEstatico();
		System.out.println("Valor de la constante "+i.CONSTANTE);
		//acedemos al metodo de instancia version 1
		//debemos crear un objeto o aprovechar 1 que exista
		InstanciaEstatico nuevoObjeto = new InstanciaEstatico();
		System.out.println("Numero aletatorio: "+nuevoObjeto.version1());
		//Acedemos al metodo de clase opcion 2
		//no hace falta crear o usar objetos
		System.out.println("Numero aletatorio: "+version2());
		
		
	}
	public int version1(){
		return (int) (Math.random()*100);
	}
	public static int version2(){
		return (int) (Math.random()*100);
	}
}
class Cuadrado{
	private int arista;
	private static int numeroCuadrados=0;
	public Cuadrado(int arista) {
		this.arista = arista;
		numeroCuadrados++;
	}
	public int getArista() {
		return arista;
	}
	public static int getNumeroCuadrados() {
		return numeroCuadrados;
	}
	@Override
	public String toString() {
		return "Cuadrado [arista=" + arista + "]";
	}
	/*public static int aristaPorDos(){
		return this.arista*2;
	}*/
	
	
}	