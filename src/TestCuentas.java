
public class TestCuentas {
	public static void main(String[] args) {
		CuentaBancaria c1 = new CuentaBancaria();
		CuentaBancaria c2 = new CuentaBancaria(400,2.5);
		CuentaBancaria c3 = new CuentaBancaria(600,3.5);
		CuentaBancaria c4 = new CuentaBancaria();
		CuentaBancaria c5 = new CuentaBancaria();
		Banco b = new Banco();
		b.guardaCuentas(c1);
		b.guardaCuentas(c2);
		b.guardaCuentas(c3);
		b.guardaCuentas(c4);
		b.guardaCuentas(c5);
		System.out.println(b);
		System.out.println("-------------------------------------------------");
		System.out.println("Cuenta mayor saldo "+b.cuentaMayor());
		System.out.println("Cuenta menor saldo "+b.cuentaMenor());
		System.out.println("Numero de cuentas creadas: "+CuentaBancaria.getNumeroDeCuentasCreadas());
		
		
	}
	
}
