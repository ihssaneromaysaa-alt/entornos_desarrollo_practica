// Escribe un programa que dados dos números, uno real (base) y un entero positivo
//(exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador
//de potencia.

import java.util.Scanner;
public class Ej8{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner (System.in);
		double base1,base2;
		int exp,i;
		double resultado=1;
		
		//Datos de entrada
		System.out.println("Base: ");
		base1=sc.nextDouble();
		System.out.println("Exponente: ");
		exp=sc.nextInt();
		
		base2=base1;
		
		//Datos de salida
		for(i=1;i<=exp;i++){
			resultado*=base1;
			System.out.print(base2);
			if(i<exp)
				System.out.print("*");
		}
		System.out.print(" = "+resultado);
	}
}