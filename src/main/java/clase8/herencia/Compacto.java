package clase8.herencia;

public class Compacto extends Auto {
	
	private int puestos;

	public Compacto() {
		super();
	}

	public Compacto(String color, String marca, String patente, boolean encendido, int puestos) {
		super(color, marca, patente, encendido);
		this.puestos = puestos;
	}

	public String mostrarDatos() {
		return "auto[color= " + getColor() + 
				", patente= " + getPatente() + 
				", puestos= " + puestos +
				"]";
	}
	
	
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	

}
