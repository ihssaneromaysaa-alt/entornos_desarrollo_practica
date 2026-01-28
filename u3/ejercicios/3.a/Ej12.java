import java.util.Scanner;
public class Ej12{
	public static void main(String[]args){

		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int num;

		System.out.print("Introduzca un número:");
		num=sc.nextInt();

		//max con int 2147483647

		System.out.print("Número de dígitos: "+(int)(Math.log10(num)+1));
	}
}