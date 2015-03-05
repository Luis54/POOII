
public class TestCuentas {
	public static void main(String[] args) {
		CuentaBancaria c1 = new CuentaBancaria();
		CuentaBancaria c2 = new CuentaBancaria();
		CuentaBancaria c3 = new CuentaBancaria();
		CuentaBancaria c4 = new CuentaBancaria();
		CuentaBancaria c5 = new CuentaBancaria();
		Banco b = new Banco();
		b.guardaCuentas(c1);
		b.guardaCuentas(c2);
		b.guardaCuentas(c3);
		b.guardaCuentas(c4);
		b.guardaCuentas(c5);
		
		System.out.println(b);
	}
	
}
