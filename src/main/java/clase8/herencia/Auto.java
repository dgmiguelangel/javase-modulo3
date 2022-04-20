package clase8.herencia;

public class Auto {
	
	private String color;
	private String marca;
	private String patente;
	private boolean encendido;	
	public static String concesionaria;
	
	static {
		concesionaria = "Autos IT";
	}	
	
	public Auto() {
		super();
	}

	public Auto(String color, String marca, String patente, boolean encendido) {
		super();
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.encendido = encendido;
	}

	
	public String mostrarDatos() {
		return "auto[color= " + color + ", patente= " + patente + "]";
	}

	public void encender() {
		encendido = true;
	}
	
	public void apagar() {
		encendido = false;
	}
	
	//SOBRECARGA DE METODOS
	public void cambiarEstado(boolean encendido) {
		this.encendido = encendido;
	}
	
	public void cambiarEstado() {
		encendido = !encendido;
	}	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public static void setConcesionaria(String concesionaria) {
		Auto.concesionaria = concesionaria;
	}
		

}
