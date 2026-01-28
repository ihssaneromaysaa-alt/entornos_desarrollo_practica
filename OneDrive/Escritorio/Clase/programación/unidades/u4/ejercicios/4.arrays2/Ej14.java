/*
pedir 8 palabras
ordenar el array, primero colores
los colores que conoce el programa:
verde, rojo, azul, amarillo, naranja, rosa, negro, blanco, morado*/

import java.util.Scanner;
import java.util.Arrays;
public class Ej14{
	public static void main(String[] args) {
		//objetos y variables
		Scanner sc=new Scanner(System.in);
		String[] palabras=new String[8];
		String[] palabrasAux=new String[8];
		String[] colores={"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
		int i,j,k;//contadores
		String repuesto;
		boolean esColor=false;

		System.out.println("Introduzca las palabras que quieres agregar: ");
		for (i=0; i<palabras.length; i++) {
			System.out.print((i+1)+". ");
			palabras[i]=sc.nextLine().trim().toLowerCase();
		}
		k=0;
		//primero agregamos los colores en orden
		for (i=0; i<palabras.length; i++) {
			for (j=0; j<colores.length; j++) {
				if(palabras[i].equals(colores[j])){
					palabrasAux[k]=palabras[i];
					k++;
					j=colores.length;
				}
			}
		}
		//bucle para obsevar si no son colores y 
		//añadirlos en el nuevo array
		for (i=0; i<palabras.length; i++) {
			esColor=false; //para cada palabra vuelve a comprobar
			//si es un color o no
			for (j=0; j<colores.length; j++) {
				if(palabras[i].equals(colores[j])){
					esColor=true;
					j=colores.length;
				}
			}
			if(!esColor){
				palabrasAux[k]=palabras[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(palabrasAux));
	}
}