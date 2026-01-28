
import java.util.Scanner;
import java.util.Arrays;
public class Ej5_1{
	public static void main(String[] args) {
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int[] numeros=new int[5];
		int repuesto=0, nFinal=0;
		int i;
		//Entrada
		System.out.println("Introduzca 5 números.");
		for(i=0;i<numeros.length;i++){
			System.out.println("Número["+i+"]: ");
			//numeros[i]=sc.nextInt();
			numeros[i]=(int)(Math.random()*(100-0+1)+0);
			//System.out.println(numeros[i]);
		}
		//Cambio de posiciones
		nFinal=numeros[numeros.length-1];//el último número se guarda
		System.out.println("Array original: "+Arrays.toString(numeros));
		for (i=numeros.length-1; i>0; i--)//empezamos desde el final
        	numeros[i] = numeros[i - 1];//el número en el que estamos se cambia por el anterior
		numeros[0]=nFinal;
		
		//Salida
		System.out.println("Array rotado: "+Arrays.toString(numeros));
	}
}