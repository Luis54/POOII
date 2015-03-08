
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
	
	public CuentaBancaria cuentaMayor(){
		CuentaBancaria mayorSaldo = numeroDeCuentas.get(0
				) ;
		for (int i = 0; i < numeroDeCuentas.size(); i++) {
			if (numeroDeCuentas.get(i).getSaldo() > mayorSaldo.getSaldo()) {
				mayorSaldo=numeroDeCuentas.get(i);
			}
		}
			
		
				
			
		
		return mayorSaldo;
	}

	
	
	public CuentaBancaria cuentaMenor(){
		CuentaBancaria menorSaldo = numeroDeCuentas.get(0) ;
		for (int i = 0; i < numeroDeCuentas.size(); i++) {
			if (numeroDeCuentas.get(i).getSaldo() < menorSaldo.getSaldo()) {
				menorSaldo=numeroDeCuentas.get(i);
				
			}
		}
			
		
				
			
		
		return menorSaldo;
	}
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
	public static void main(String[] args) {
		Banco lista = new Banco();
		CuentaBancaria c1 = new CuentaBancaria();
		CuentaBancaria c2 = new CuentaBancaria(450,5.5);
		CuentaBancaria c3 = new CuentaBancaria(150,3.5);
		lista.guardaCuentas(c1);
		lista.guardaCuentas(c2);
		lista.guardaCuentas(c3);
		System.out.println("La cuenta con mayor saldo es : "+lista.cuentaMenor());
	
	}
}
