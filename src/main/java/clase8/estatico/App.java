package clase8.estatico;

public class App {
	
	public static void main(String[] args) {
		
		Auto a1 = new Auto("rojo", "renault", "omc896", false);
		Auto a2 = new Auto("amarillo", "peugeot", "abc898", true);	
		
		System.out.println(Auto.concesionaria);
		
//		System.out.println(a1.concesionaria);
//		System.out.println(a2.concesionaria);
//		
//		a1.setConcesionaria("IT");
//		
//		System.out.println(a1.concesionaria);
//		System.out.println(a2.concesionaria);
		
	}
	
}
