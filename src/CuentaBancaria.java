import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;


public class CuentaBancaria {
	private String numeroCuenta;
	private double saldo = 0;
	private double interes = 2.5;
	//private Date fechaCreacion = new Date("dddd/mm/dd");
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
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
/*	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}*/
	public CuentaBancaria(){
		
	}
	public CuentaBancaria(double saldo, double interes) {
		numeroCuenta = numeroCuentasCreadas;
		this.saldo = saldo;
		this.interes = interes;
		//this.fechaCreacion = fechaCreacion Date fechaCreacion;
	}
	public static int entidad[]= {1,2,3,4};
	public static int oficina[] = {5,6,7,8};
	public String numeroDeCuentaAleatorio(){
		String numero = "";
		for (int i = 0; i < 10; i++) {
			int aleatorio;
			
			aleatorio = (int) Math.random()*10;	
			numero+=aleatorio;
			
			
		}
		setNumeroCuenta(numero);
		return numeroCuenta;
	
	}
	public int digitoControl1(){
	int numero1 = 0;	int numeroEntidad1 = 0;	int suma;
	int numero2 = 0;	int numeroEntidad2 = 0;	int residuo;
	int numero3 = 0;	int numeroEntidad3 = 0;	int digito1;
	int numero4 = 0;	int numeroEntidad4 = 0;
		for (int i = 0; i < oficina.length; i++) {
			numero1 = oficina[0]*4;
			numero2 = oficina[1]*8;
			numero3 = oficina[2]*5;
			numero4 = oficina[3]*10;
			for (int j = 0; j < entidad.length; j++) {
				numeroEntidad1 = entidad[0]*9;
				numeroEntidad2 = entidad[1]*7;
				numeroEntidad3 = entidad[2]*3;
				numeroEntidad4 = entidad[3]*6;
			}
				
		}
		suma = (numero1+numero2+numero3+numero4+numeroEntidad1+numeroEntidad2+
				numeroEntidad3+numeroEntidad4)/11;
		residuo = suma%11;
		digito1 = 11-residuo;
		return digito1;
			
	}
	/*int numeroCuentaArray = new Integer(numeroCuenta);
	public int digitoControl2(){
		int numero1 = 0;	int numero5 = 0;	int suma;		int numero10 = 0;
		int numero2 = 0;	int numero6 = 0;	int residuo;
		int numero3 = 0;	int numero7 = 0;	int digito2;
		int numero4 = 0;	int numero8 = 0;	int numero9 = 0;
			for (int i = 0; i < numeroCuentaArray; i++) {
				numero1 = numeroCuentaArray[0]*1;
				numero2 = numeroCuentaArray[0]*2;
				numero3 = numeroCuentaArray[0]*4;
				numero4 = numeroCuentaArray[0]*8;
				numero5 = numeroCuentaArray[0]*5;
				numero6 = numeroCuentaArray[0]*10;
				numero7 = numeroCuentaArray[0]*9;
				numero8 = numeroCuentaArray[0]*7;
				numero9 = numeroCuentaArray[0]*3;
				numero10 = numeroCuentaArray[0]*6;
					
			}
			suma = (numero1+numero2+numero3+numero4+numero5+numero6+numero7
					+numero8+numero9+numero10);
			residuo = 11%suma;
			digito2 = 11-residuo;
			return digito2;
				
		}*/
	
	public void depositarDinero(){
		setSaldo(saldo);
	}
	public void retirarDinero(){
		setSaldo(saldo);
	}
	public String numeroCuentasCreadas = entidad[0]+""+entidad[1]+""+entidad[2]+""+entidad[3]+
			"-"+oficina[0]+""+oficina[1]+""+oficina[2]+""+oficina[3]+"-"+digitoControl1()+
			"-"+numeroDeCuentaAleatorio();


	@Override
	public String toString() {
		return "CuentaBancaria " + numeroCuentasCreadas + " Saldo=" + saldo ;
	}

	public static void main(String[] args) {
		
		CuentaBancaria c1 = new CuentaBancaria(1000, 3.5);
		
		System.out.println(c1);
	
	}
	
	
	
	

}
