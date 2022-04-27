package clase8.laboratorio;

import java.time.LocalDate;

public class Profesor extends Persona {
	
	private double sueldo;

	public Profesor(String nombre, String apellido, Documento documento, LocalDate fechaNacimiento, double sueldo) {
		super(nombre, apellido, documento, fechaNacimiento);
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Profesor [sueldo=" + sueldo + ", toString()=" + super.toString() + "]";
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
