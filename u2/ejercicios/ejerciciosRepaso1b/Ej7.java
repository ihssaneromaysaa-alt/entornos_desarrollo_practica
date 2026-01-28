import java.util.Scanner;
public class Ej7{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		String cad1="",cad2="",cad="";
		
		//Datos de entrada
		System.out.println("Introduzca una cadena");
		cad1=sc.nextLine();
		
		System.out.println("Introduzca otra cadena");
		cad2=sc.nextLine();
		
		//Intercambio de contenido de cadena con una de repuesto:
		cad=cad1;
		cad1=cad2;
		cad2=cad;
		//Salida
		System.out.println("Cadena uno: "+cad1+"\nCadena dos: "+cad2);
	}
}