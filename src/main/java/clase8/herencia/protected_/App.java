package clase8.herencia.protected_;

import java.time.LocalDate;

public class App {
	
	public static void main(String[] args) {
		
		Camion c1 = new Camion("amarillo", "peugeot", "abc898", true, LocalDate.of(2001, 10, 8), 4, 5000);	
		System.out.println(c1.calcularAntiguedad());
		System.out.println(c1.mostrarDatos());
				
	}
	
}
