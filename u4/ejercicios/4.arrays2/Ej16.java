import java.util.Scanner;
import java.util.Arrays;
/*
Escribe un programa que rellene un array de 20 elementos con
números enteros aleatorios comprendidos entre 0 y 400 (ambos
 incluidos). Acontinuación el programa preguntará si el usuario
 quiere resaltar los múltiplos de 5 o los múltiplos de 7.
 Seguidamente se volverá a mostrar el array escribiendo
 los números que se quieren resalantar entre corchetes
*/
public class Ej16{
	public static void main(String [] args){
		//variables y objetos
		Scanner sc=new Scanner ( System.in );
		int opcion, i;
		int[] num=new int[20];

		//rellenando array:
		//utilizando un bucle for
		//y math random
		for (i=0; i<num.length; i++)
			num[i]=(int)(Math.random()*(400-0)-0);

		//enseñando el array
		for(i=0; i<num.length; i++)
			System.out.print(num[i]+" ");

		//el cliente elige el caso
		//System.out.print("[números múltiplos del 5]");
		//System.out.print("[números múltiplos del 7]");
		System.out.println("¿Qué números quiere resaltar?");
		System.out.println("0. Múltiples de 5");
		System.out.println("1. Múltiples de 7");
		opcion=sc.nextInt();

		//en este caso haré este ejercicio con un switch case
		switch(opcion){
			case 0:
				//múltiplos de 5
				for (i=0; i<num.length; i++) {
					if(num[i]%5==0)
						System.out.print("["+num[i]+"] ");
					else
						System.out.print(num[i]+" ");
				}
				break;//lol
			case 1:
				//múltiplos de 7
				for (i=0; i<num.length; i++) {
					if(num[i]%7==0)
						System.out.print("["+num[i]+"] ");
					else
						System.out.print(num[i]+" ");
				}
				break;//obligatoriojaja
		}
	}
}