import java.util.Scanner;


public class TestRectangulo {
	public static void main(String[] args) {

		System.out.println("Introduce el ancho y el alto para el rectangulo 3");

		Scanner in = new Scanner(System.in);
		
		double param1 = in.nextDouble();
		
		double param2 = in.nextDouble();
		
		Rectangulo r1 = new Rectangulo();

		
		Rectangulo r2 = new Rectangulo(20,30);
		
		System.out.println("Introduce el ancho y el alto para el rectangulo 3");

		Rectangulo r3 = new Rectangulo(param1,param2);
		
		Rectangulo r4 = new Rectangulo();
		
		System.out.println("El rectangulo 1 es: "+r1);
		System.out.println("Y tiene un area de: "+r1.areaRectangulo());
		System.out.println("Y tiene un perimetro de : "+r1.perimetroRectangulo());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("El rectangulo 2 es: "+r2);
		System.out.println("Y tiene un area de: "+r2.areaRectangulo());
		System.out.println("Y tiene un perimetro de : "+r2.perimetroRectangulo());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("El rectangulo 3 es: "+r3);
		System.out.println("Y tiene un area de: "+r3.areaRectangulo());
		System.out.println("Y tiene un perimetro de : "+r3.perimetroRectangulo());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("El rectangulo 4 es: "+r4);
		System.out.println("Y tiene un area de: "+r4.areaRectangulo());
		System.out.println("Y tiene un perimetro de : "+r4.perimetroRectangulo());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Cuantos objetos Rectangulos hay: "+Rectangulo.cuantosRectangulosHay());
		in.close();
	}

}
