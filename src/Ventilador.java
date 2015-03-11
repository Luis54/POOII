

public class Ventilador {
	private posiciones velocidad;
	private boolean funcionado ;
	private double rVentilador;
	private String color;
	
	public posiciones getVelocidad() {
		return velocidad;
	}
	public  void setVelocidad(posiciones v) {
		this.velocidad = v;
	}
	public boolean isFuncionado() {
		return funcionado;
	}
	public void setFuncionado(boolean funcionado) {
		this.funcionado = funcionado;
	}
	public double getrVentilador() {
		return rVentilador;
	}
	public void setrVentilador(double rVentilador) {
		this.rVentilador = rVentilador;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Ventilador(){
		this.funcionado = false;
		this.rVentilador = 50;
		this.color = "blanco";
		this.velocidad = posiciones.LENTO;
	}
	@Override
	public String toString() {
		return "Ventilador [velocidad = " + velocidad + ", funcionado = "
				+ funcionado + ", Radio Ventilador = " + rVentilador + ", color = "
				+ color + "]";
	}
	
	
}
enum posiciones {LENTO,MEDIO,RAPIDO};