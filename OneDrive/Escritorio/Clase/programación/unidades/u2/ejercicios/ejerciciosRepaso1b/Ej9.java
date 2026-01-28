import java.util.Scanner;
public class Ej9{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		int edad;
		String resultado;
		
		//Entrada de datos
		System.out.println("Introduzca la edad");
		edad=sc.nextInt();
		
		//Comparación
		resultado=(edad>=18)?"Eres mayor de edad":"No eres mayor de edad";
		
		//Salida de datos
		System.out.println(resultado);
	}
}