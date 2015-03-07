
import java.util.ArrayList;
import java.util.List;




public class Banco {
	
	private List<CuentaBancaria> numeroDeCuentas;
	
	

	public Banco() {
		numeroDeCuentas = new ArrayList<CuentaBancaria>();
	}



	public void guardaCuentas(CuentaBancaria c){
		numeroDeCuentas.add(c);
	}
	
	public void bajaCuentas(CuentaBancaria c){
		numeroDeCuentas.remove(c);
	}
	
	/*public String cuentaMayor(){
		String cuentaMayor = "";
		String saldo = "";
		for (CuentaBancaria cuentaBancaria : numeroDeCuentas) {
			if (cuentaBancaria.getSaldo() < cuentaBancaria.getSaldo()) {
				
			}
		}
		
		return cuentaMayor;
	}*/

	
	
	/*public String cuentaMenor(){
		String cuentaMayor = "";
		for (CuentaBancaria cuentaBancaria : numeroDeCuentas) {
			if (cuentaBancaria.getSaldo() > cuentaBancaria.getSaldo() ) {
				cuentaMayor = cuentaBancaria.numeroTotal();
				
			}
		}
		
		return cuentaMayor;
	}*/
	
	public double saldoMedio(){
		double saldoMedio=0;
		for (CuentaBancaria cuentaBancaria : numeroDeCuentas) {
			saldoMedio+=cuentaBancaria.getSaldo();
		}
		return saldoMedio/numeroDeCuentas.size();
	}


	@Override
	public String toString() {
		return "Numero de cuentas = " + numeroDeCuentas + " Saldo Medio "+saldoMedio()+"\n";
	}
	/*public static void main(String[] args) {
		Banco lista = new Banco();
		CuentaBancaria c1 = new CuentaBancaria();
		CuentaBancaria c2 = new CuentaBancaria(100,2.5);
		CuentaBancaria c3 = new CuentaBancaria(300,3.5);
		lista.guardaCuentas(c1);
		lista.guardaCuentas(c2);
		lista.guardaCuentas(c3);
	
	}*/
}
