package Diapositivas;

public class Ventilador {
	private  enum posiciones {LENTO,MEDIO,RAPIDO};
	private  posiciones velocidad = posiciones.LENTO;
	private boolean funcionado = false;
	private double rVentilador = 50;
	private String color = "blanco";
	
	public posiciones getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(posiciones velocidad) {
		this.velocidad = velocidad;
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
		
	}
	@Override
	public String toString() {
		return "Ventilador [velocidad=" + velocidad + ", funcionado="
				+ funcionado + ", rVentilador=" + rVentilador + ", color="
				+ color + "]";
	}
	
	
}
