import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ej5{
	public static void main(String[]args){

		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String matricula, regex="^[0-9]{4}[B-Z^(AEIOUÑQ)]{3}$";
		int num;

		//Entrada
		System.out.print("Matricula: ");
		matricula=sc.nextLine().trim().toUpperCase();
		//3456BZD

		//Creamos el patrón
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(matricula);
	
		//Comparamos y sacamos el resultado
		if(m.matches())
			System.out.println("Coincide");
		else
			System.out.println("No coincide");
	}
}