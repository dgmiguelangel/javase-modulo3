package clase8.herencia.sobreescritura;

public class Compacto extends Auto {
	
	private int puestos;

	public Compacto() {
		super();
	}

	public Compacto(String color, String marca, String patente, boolean encendido, int puestos) {
		super(color, marca, patente, encendido);
		this.puestos = puestos;
	}
	
	
	@Override
	public String toString() {
		return "Compato [puestos=" + puestos + ", toString()=" + super.toString() + "]";
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	

}
