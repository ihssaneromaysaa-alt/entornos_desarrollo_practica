import java.util.Scanner;
public class Ej1{
	public static void main(String[]args){

		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String cadena;

		System.out.print("Introduzca una cadena: ");
		cadena=sc.nextLine();

		for(int i=0; i<cadena.length();i++){
			System.out.println(cadena.charAt(i));
		}
	}
}