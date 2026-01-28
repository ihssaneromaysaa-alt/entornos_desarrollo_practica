import java.util.Scanner;
public class PruebaArrays{
	public static void main(String[] args) {
		
		//Objetos y varibles
		Scanner sc=new Scanner(System.in);
		//Ejemplo de arrray declaración
		int suma;
		int[] num;
		//creación
		num=new int[10];
		/*
		Autoevaluación
		double[] numeros; numeros=new double[53];
		float[] numeros=new float[54];
		*/
		//modificación del array unidimensional
		num[0]=99;
		num[1]=2;
		suma=num[0]-num[1];
		System.out.println(suma);
		/* Para pasar como argumento un array a una función, simplemente
		se pone el nombre del array:*/
		int suma=sumaarray (Numeros);
	}
}