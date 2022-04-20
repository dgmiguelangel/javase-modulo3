package clase8.herencia.sobreescritura;

public class App {
	
	public static void main(String[] args) {
		
		Auto a1 = new Auto("rojo", "renault", "omc896", false);
		System.out.println(a1);
		
		Camion c1 = new Camion("amarillo", "peugeot", "abc898", true, 4, 5000);	
//		System.out.println(c1.toString());
		System.out.println(c1);
				
	}
	
}
