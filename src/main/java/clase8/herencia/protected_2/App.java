package clase8.herencia.protected_2;

import java.time.LocalDate;

import clase8.herencia.protected_.Camion;

public class App {
	
	public static void main(String[] args) {
		
		Camion c1 = new Camion("amarillo", "peugeot", "abc898", true, LocalDate.of(2001, 10, 8), 4, 5000);	
//		System.out.println(c1.calcularAntiguedad()); //The method calcularAntiguedad() from the type Auto is not visible
		System.out.println(c1.mostrarDatos());
				
	}
	
}
