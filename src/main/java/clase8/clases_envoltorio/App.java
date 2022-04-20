package clase8.clases_envoltorio;

public class App {

	public static void main(String[] args) {
		
		Byte num1 = new Byte("125"); // CONTRUCTORES DEPRECADOS A PARTIR DE JAVA 9
		Byte num2 = new Byte((byte) 1);
		
		
		Byte num4 = Byte.valueOf("2"); // METODO DE CLASE
		Byte num5 = Byte.valueOf((byte) 2);
		
		byte num6 = Byte.parseByte("97"); // METODO DE CLASE
		
		
		byte num3 = num1.byteValue(); // METODO DE INSTANCIA
		System.out.println(num3);	
		
		
		Byte num7 = 97; // BOXING
		byte num8 = num7;// UNBOXING

	}

}
