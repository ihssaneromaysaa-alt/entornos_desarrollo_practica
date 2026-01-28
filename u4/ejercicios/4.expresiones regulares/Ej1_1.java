import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Ej1_1{
	public static void main(String[]args){

		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		String dni;
		
		//Entrada
		System.out.print("Introduzca los números del DNI: ");
		dni=sc.nextLine().toUpperCase();

		//Patrón
		Pattern p= Pattern.compile("^[0-9]{8}[A-Z]{1}$");
		Matcher m= p.matcher(dni);

		//Salida
		if(m.matches())
			System.out.println("Coincide");
		else
			System.out.println("No coincide");
	}
}