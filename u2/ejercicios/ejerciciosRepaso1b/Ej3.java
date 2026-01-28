import java.util.Scanner;
public class Ej3{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		char a;
		String cad;
		
		//Entrada de datos
		System.out.println("Introduzca un carácter");
		a=sc.nextLine().charAt(0);
		System.out.println("Introduzca una cadena");
		cad=sc.nextLine();
		
		//Salida de datos
		System.out.println(cad+a);
	}
}