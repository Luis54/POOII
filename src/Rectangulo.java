
public class Rectangulo {

	private double ancho = 1;
	private double alto = 1;
	
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
		objetoRectangulo++;
	}
	public Rectangulo(){
		objetoRectangulo++;
	}
	
	public double areaRectangulo(){
		return ancho*alto;	
	}
	public double perimetroRectangulo(){
		return (2*ancho)+(2*alto);
	}
	
	
	private static int objetoRectangulo = 0;
	public static int cuantosRectangulosHay(){
		return objetoRectangulo;
	}
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
}
