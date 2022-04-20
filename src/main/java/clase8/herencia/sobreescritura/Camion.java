package clase8.herencia.sobreescritura;

public class Camion extends Auto {
	
	private int ejes;
	private double capacidad;
	
	public Camion() {
		super();
	}

	Camion(String color, String marca, String patente, boolean encendido, int ejes, double capacidad) {
		super(color, marca, patente, encendido);
		this.ejes = ejes;
		this.capacidad = capacidad;
	}
	
	
	@Override
	public String toString() {
		return "Camion [ejes=" + ejes + ", capacidad=" + capacidad + ", getColor()=" + getColor() + ", getMarca()="
				+ getMarca() + ", getPatente()=" + getPatente() + ", isEncendido()=" + isEncendido() + "]";
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	

}
