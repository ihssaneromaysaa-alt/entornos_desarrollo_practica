import java.util.Scanner;
public class Ej9{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc= new Scanner(System.in);
		String cadena;
		char carac;
		int i=0;
		
		//Entrada de datos
		System.out.print("Introduze una cadena de texto: ");
		cadena=sc.nextLine();
		
		//Salida
		//System.out.print(cadena.length());
		while(i<cadena.length()){
			carac=cadena.charAt(i);
			System.out.println(carac);
			i++;
		}
	}
}