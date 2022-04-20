package clase8.laboratorio;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {		
		
		Persona[] personas;
		byte cp = 0;
		
		Persona p;
		String nombre, apellido;
		
		String tipoDocumento;		
		int numeroDocumento;
		
		LocalDate fechaNacimiento;		
		
		System.out.println("Ingrese cantidad de personas");
		cp = sc.nextByte();		
		personas = new Persona[cp];		
		
		
		for(byte i = 0; i < personas.length; i++) {
			
			System.out.println("Ingrese el nombre");
			nombre = sc.nextLine();
						
			sc.nextLine();
			System.out.println("Ingrese el apellido");
			apellido = sc.nextLine();
			
			System.out.println("Ingrese el tipo de documento");
			tipoDocumento = sc.next();
			
			System.out.println("Ingrese el nro de documento");
			numeroDocumento = sc.nextInt();
			
			System.out.println("Ingrese la fecha de nacimiento");
			fechaNacimiento = ingresarFechaNacimiento();			
			
			p = new Persona(nombre, apellido, new Documento(tipoDocumento, numeroDocumento), fechaNacimiento);
			personas[i] = p;
			
		}
		
		
		
		System.out.println("\nDatos de las Personas");
		
		for (int i = 0; i < personas.length; i++) {			
			System.out.println(
					"nombre= " + personas[i].getNombre() + 
					", apellido= " + personas[i].getApellido() + 
					", tipoDocumento= " + personas[i].getDocumento().getTipoDocumento() + 
					", numeroDocumento= " + personas[i].getDocumento().getNumeroDocumento() + 
					", edad=" + personas[i].calcularEdad() + 
					", es " + (personas[i].esMayorEdad() ? "mayor de edad" : "menor de edad")
			);			
		}
		
		sc.close();

	}
	
	
	private static LocalDate ingresarFechaNacimiento() {
		int anio, mes, dia;
		
		System.out.print("Ingrese el año: ");
		anio = sc.nextInt();
		System.out.print("Ingrese el mes: ");
		mes = sc.nextInt();
		System.out.print("Ingrese el dia: ");
		dia = sc.nextInt();
		
		return LocalDate.of(anio, mes, dia);
	}

}
