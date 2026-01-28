/*Realizar una algoritmo que muestre la tabla de multiplicar de un número introducido por
teclado.*/
import java.util.Scanner;
public class Ej7{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner (System.in);
		int num,i;
		
		System.out.print("Número: ");
		num=Integer.parseInt(sc.nextLine());
		
		//Estructura repetitiva
		for(i=0;i<=10;i++){
			//Salida de datos con la tabla de multiplicar.
			System.out.println(num+"*"+i+" = "+i*num);
		}
	}
}