import java.util.Scanner;
import java.util.Arrays;

public class Ej5{
	public static void main(String[] args) {
		//Objetos yvariables
		Scanner sc=new Scanner(System.in);
		int[] numeros= new int[11];
		int num1,num2,i;
		System.out.println("Ontroduzca 10 números enteros:");
		for(i=0;i<numeros.length;i++)
			numeros[i]=sc.nextInt();
		Arrays.sort(numeros);
		System.out.println("Mínimo: "+numeros[0]);
		System.out.println("Máximo: "+numeros[numeros.length-1]);

	}
}