

import java.util.Scanner;
import java.util.Arrays;
public class Ej6{
	public static void main(String[] args) {
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		double[] numeros=new double[16];
		double repuesto=0;
		int i;
		//Entrada
		System.out.println("Introduzca 15 números.");
		for(i=0;i<numeros.length;i++){
			System.out.print("Número["+i+"]: ");
			numeros[i]=sc.nextInt();
			//numeros[i]=Math.floor(Math.random()*(100-0+1)+0);
			//System.out.println(numeros[i]);
		}
		//Cambio de posiciones
		//numero =[0,1,2]
		//repuesto = 1
		//numero[1] = 1
		//numero= [1,2,0]
		System.out.println("\n");
		for(i=0;i<numeros.length;i++){
			if(i!=0 && i!=(numeros.length-1)){
				repuesto=numeros[i];
				numeros[i-1]=numeros[i];
				numeros[i]=repuesto;
			}
			else{
				repuesto=numeros[i];
				numeros[numeros.length-1]=numeros[i];
				numeros[i]=repuesto;

				repuesto=numeros[numeros.length-1];
				numeros[0]=numeros[numeros.length-1];
				//numeros[numeros.length-1]=repuesto;
			}
		}
		
		//Salida
		for(i=0;i<numeros.length;i++)
			System.out.println("Numero["+i+"]: "+numeros[i]);
	}
}