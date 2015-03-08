



public class TestVentilador {
	public static void main(String[] args) {
		Ventilador v1 = new Ventilador();
		Ventilador v2 = new Ventilador();
		v2.setColor("Azul");
		v2.setFuncionado(true);
		v2.setrVentilador(10000);
		v2.getVelocidad();
		System.out.println(v1);
		System.out.println(v2);
	}
	
	
}
