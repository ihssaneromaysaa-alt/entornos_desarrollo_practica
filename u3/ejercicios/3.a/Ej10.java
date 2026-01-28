import java.util.Scanner;
public class Ej10{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String cadena;
		char carac;
		int i=0;
		
		//Entrada
		System.out.print("Introduzca un texto.");
		cadena=sc.nextLine();
		
		while(i<cadena.length()){
			carac=cadena.toLowerCase().charAt(i);
			if(i==0){
				carac=cadena.toUpperCase().charAt(0);
			}
			//Salida
			System.out.print(carac);
			i++;
		}
		
	}
}