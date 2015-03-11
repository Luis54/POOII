import java.time.LocalDate;

public class CuentaBancaria {
	private String numeroCuenta ="";
	private double saldo = 0;
	private double interes = 2.5;
	private LocalDate fechaCreacion;
	private static int numeroDeCuentasCreadas = 0;
	
	
	public static int getNumeroDeCuentasCreadas() {
		return numeroDeCuentasCreadas;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	

	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public CuentaBancaria(){
		this.numeroCuenta = numeroDeCuentaAleatorio();
		this.fechaCreacion = LocalDate.now();
		numeroDeCuentasCreadas++;
	}
	
	public CuentaBancaria(double saldo, double interes) {
		this.saldo = saldo;
		this.interes = interes;
		this.numeroCuenta = numeroDeCuentaAleatorio();
		this.fechaCreacion = LocalDate.now();
		numeroDeCuentasCreadas++;
	}
	public static int entidad[]= {1,2,3,4};
	public static int oficina[] = {6,7,8,9};
	public String numeroDeCuentaAleatorio(){
		String numero = "";
		int aleatorio;
		for (int i = 0; i < 10; i++) {
			aleatorio = (int) (Math.random()*10);	
			numero+=aleatorio;
		}
		return  numero;
	}
	public int digitoControl1(){
	int suma = 0;
			suma+= oficina[0]*4;
			suma+= oficina[1]*8;
			suma+=oficina[2]*5;
			suma+= oficina[3]*10;

			suma+= entidad[0]*9;
			suma+=entidad[1]*7;
			suma+=entidad[2]*3;
			suma+= entidad[3]*6;
			return suma%10;
			
	}
	public int digitoControl2(){
		int suma=0;
		for (int i = 0; i < numeroCuenta.length()-1; i++) {
				suma += Integer.parseInt(numeroCuenta.substring(0,1))*1;
				suma += Integer.parseInt(numeroCuenta.substring(1,2))*2;
				suma += Integer.parseInt(numeroCuenta.substring(2,3))*4;
				suma += Integer.parseInt(numeroCuenta.substring(3,4))*8;
				suma += Integer.parseInt(numeroCuenta.substring(4,5))*5;
				suma += Integer.parseInt(numeroCuenta.substring(5,6))*10;
				suma += Integer.parseInt(numeroCuenta.substring(6,7))*9;
				suma += Integer.parseInt(numeroCuenta.substring(7,8))*7;
				suma += Integer.parseInt(numeroCuenta.substring(8,9))*3;
				suma += Integer.parseInt(numeroCuenta.substring(9))*6;		
		}
			return suma%10;	
		}
	
	public void depositarDinero(){
		setSaldo(saldo);
	}
	public void retirarDinero(){
		setSaldo(saldo);
	}
	public String toString (){ return "Cuenta Bancaria "+ entidad[0]+""+entidad[1]+""+entidad[2]+""+entidad[3]+
			"-"+oficina[0]+""+oficina[1]+""+oficina[2]+""+oficina[3]+"-"+digitoControl1()+""+digitoControl2()+
			"-"+this.numeroCuenta+"----------"+"Fecha Creacion cuenta bancaria "+fechaCreacion;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numeroCuenta == null) ? 0 : numeroCuenta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		if (numeroCuenta == null) {
			if (other.numeroCuenta != null)
				return false;
		} else if (!numeroCuenta.equals(other.numeroCuenta))
			return false;
		return true;
	}
	
	}


	/*public static void main(String[] args) {
		
		CuentaBancaria c1 = new CuentaBancaria();
		
		System.out.println(c1);
	
	}*/
	
	
	
	


