package clase8.laboratorio;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Documento documento;
	private LocalDate fechaNacimiento;
	
	Persona() {
		super();
	}

	Persona(String nombre, String apellido, Documento documento, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}	
	
	
	public int calcularEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}
	
	public boolean esMayorEdad() {
		return calcularEdad() >= 18 ? true : false;
	}
	

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
