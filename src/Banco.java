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



	@Override
	public String toString() {
		return "Banco [numeroDeCuentas=" + numeroDeCuentas + "]";
	}
	
}
