package clase8.herencia.protected_;

import java.time.LocalDate;

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
	
	
	
	public Camion(String color, String marca, String patente, boolean encendido, LocalDate fechaFabricacion, int ejes,
			double capacidad) {
		super(color, marca, patente, encendido, fechaFabricacion);
		this.ejes = ejes;
		this.capacidad = capacidad;
	}

	@Override
	public String mostrarDatos() {
		return "auto[color= " + getColor() + 
				", patente= " + getPatente() + 
				", ejes= " + ejes +
				", capacidad= " + capacidad +
				", antiguedad= " + calcularAntiguedad() +
				"]";
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
