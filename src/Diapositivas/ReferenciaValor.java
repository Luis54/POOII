package Diapositivas;



public class ReferenciaValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicial = 6;
		System.out.println("Valor del dato primitivo despues de llamar al metodo "+inicial);

		modificarPrimitivo(inicial);
		System.out.println("Valor del dato primitivo despues de llamar al metodo "+inicial);
		/*Circulo c1 = new Circulo(5.0);
		System.out.println("Posicion de memoria de c1 es: " +c1);
		Circulo c3 = c1;
		c3.setRadio(15);
		System.out.println(c3.getRadio());
		System.out.println("Posicion de memoria de c3 es: " +c3);
		modificar(c3);
		System.out.println("El valor del radio c1  " +c1.getRadio());
		System.out.println("El valor del radio c3  " +c3.getRadio());*/

	}
	public static void modificar(Circulo c2){
		System.out.println("Posicion de memoria c2 es: "+c2);
		c2.setRadio(25);
		System.out.println("Valor de radio sera " +c2.getRadio());
	}
	public static void modificarPrimitivo(int valorEnElMetodo){
		valorEnElMetodo *=2;
	}

}
class Circulo{
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	//@Override
	/*public String toString() {
		return "Circulo [radio=" + radio + "]";
	*///}
}
