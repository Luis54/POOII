
public class TestBanco {
	
	public static void main(String[] args) {
	Banco lista = new Banco();
	CuentaBancaria c1 = new CuentaBancaria();
	CuentaBancaria c2 = new CuentaBancaria(100,2.5);
	CuentaBancaria c3 = new CuentaBancaria(300,3.5);
	CuentaBancaria c4 = new CuentaBancaria();
	CuentaBancaria c5 = new CuentaBancaria(500,3.5);
	if (lista.equals(lista)) {
		lista.guardaCuentas(c1);
		lista.guardaCuentas(c2);
		lista.guardaCuentas(c3);
		lista.guardaCuentas(c4);
		lista.guardaCuentas(c5);
		System.out.println(lista);
		}

	}
}
