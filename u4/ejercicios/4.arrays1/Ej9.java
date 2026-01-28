/*Realiza un programa que pida 8 numeros enteros 
y que luego muestre esos números junto con la 
palabra "par" o "impar" según proceda*/

import java.util.Scanner;
import java.util.Arrays;
public class Ej9{
	public static void main(String[] args) {
		//Objetos y variables
		int[] num=new int[8];
		Scanner sc=new Scanner(System.in);
		int i;
		String resultado;

		//Entrada
		for(i=0;i<num.length;i++){
			System.out.println("Introduzca un número entero.");
			num[i]=sc.nextInt();
		}
		//Realización del problema
		for(i=0;i<num.length;i++){
			resultado=(num[i]%2==0)?"par":"impar";
			//Salida
			System.out.println((i+1)+". El número "+num[i]+" es "+resultado);
		}
	}
}