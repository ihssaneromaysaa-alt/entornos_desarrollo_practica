/*  13. Desarrollar un programa en Java que implemente un cifrado simple donde cada letra de una frase se
desplace un número fijo de posiciones en el alfabeto (un cifrado César con desplazamiento 3).
A -> D, B -> E, etc.
Ej: "Java" → "Mdyd"*/

import java.util.Scanner;

public class Ej13{
	public static void main(String[] args) {
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String abecedario="abcdefghijklmnñopqrstuvwxyz";
		String frase,fraseCifrada="";
		int posicion, i;

		System.out.print("Introduzca una frase:");
		frase=sc.nextLine();

		for(i=0;i<frase.length();i++){
			if(Character.isLetter(frase.charAt(i))){
				posicion=(abecedario.indexOf(frase.charAt(i)));
				posicion=(posicion+3) % abecedario.length(); 
				fraseCifrada+=abecedario.charAt(posicion);
			}
			else
				fraseCifrada+=frase.charAt(i);
		}
		System.out.println("La frase cifrada es la siguiente: "+fraseCifrada);
	}
}