import java.util.Scanner;
public class Ej6{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int num1,num2,i=1,repuesto;
		
		//Datos de entrada
		System.out.printf("\nPrograma para imprimir los números pares");
		System.out.printf("\nque existen entre dos números otorgados.");
		System.out.printf("\nNo hace falta ponerlos en orden.");
		
		System.out.printf("\nIntroduzca el primer número: ");
		num1=sc.nextInt();
		System.out.printf("Introduzca el segundo número: ");
		num2=sc.nextInt();
		
		//Realización del problema
		
		//Primero ordenamos ambos números
		if(num2<num1){
			repuesto=num1;
			num1=num2;
			num2=repuesto;
		}
		//Estructura repetitiva
		while(i<=num2){
			if(num1%2==0)
				//Datos de salida
				System.out.printf("\n%d es par.",num1);
			num1++;
			i++;
		}
	}
}