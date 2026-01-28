import java.util.Scanner;
public class Ej7{
	public static void main(String[] args) {
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int[] numeros=new int[101];
		int valor1, valor2, repuesto, i;
		for(i=0;i<numeros.length;i++){
			numeros[i]=(int)Math.floor(Math.random()*(20-0+1)+0);
			System.out.print(numeros[i]+" ");
		}
		System.out.print("\nIntroduzca el valor 1: ");
		valor1=sc.nextInt();

		System.out.print("Introduzca el valor 2: ");
		valor2=sc.nextInt();
		
		System.out.println("\nCambiando valores...\n");
		for(i=0;i<numeros.length;i++){
			if(numeros[i]==valor1)
				numeros[i]=valor2;
			}
		for(i=0;i<numeros.length;i++)
			System.out.print(numeros[i]+" ");
	}
}