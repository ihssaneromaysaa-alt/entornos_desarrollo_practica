import java.util.Scanner;
public class Ej3{
	public static void main(String[]args){

		//Objetos y variables
		Scanner sc=new Scanner (System.in);
		String cadena;

		System.out.print("Cadena:");
		cadena=sc.nextLine();

		if(cadena.equals(""))
			System.out.print("La cadena está vacía");
		else
			System.out.print(cadena);
	}
}