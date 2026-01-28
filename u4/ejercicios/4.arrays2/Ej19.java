import java.util.Scanner;
/*Programa que inserte un número en una posición concreta del
array
1. generar array con números del 0 al 200
mostrar contenido del array
preguntar por el número que se quiere insertar y posicion
desplazar todos los números a la derecha
dejando hueco en la posición indicada
y perdiendo el número de la última posición*/
public class Ej19{
	public static void main(String [] args){
		//objetos y variables
		Scanner sc=new Scanner (System.in);
		int[] num=new int[12];
		int i, nIns, numRotaciones,pNum;

		for (i=0; i<num.length; i++) 
			num[i]=(int)(Math.random()*((200-0)+1));
		//enseñamos el array
		System.out.print("índice: ");
		for (i=0; i<num.length; i++)
			System.out.printf("%4d",i);
		System.out.print("\narray:  ");
		for (i=0; i<num.length; i++)
			System.out.printf("%4d",num[i]);

		System.out.print("\n¿Qué número quiere insertar?: ");
		nIns=sc.nextInt();
		System.out.print("¿En qué posición quiere insertar "+nIns+"?: ");
		pNum=sc.nextInt();

		//como el último número se olvida entonces no lo guardamos
		for (i=num.length-1; i>=pNum; i--) {
			num[i]=num[i-1];
		}
		num[pNum]=nIns;
		//enseñamos el array
		System.out.print("índice: ");
		for (i=0; i<num.length; i++)
			System.out.printf("%4d",i);
		System.out.print("\narray:  ");
		for (i=0; i<num.length; i++)
			System.out.printf("%4d",num[i]);
	}
}