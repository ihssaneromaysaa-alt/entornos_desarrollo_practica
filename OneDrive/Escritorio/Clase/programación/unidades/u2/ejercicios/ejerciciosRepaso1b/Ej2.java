import java.util.Scanner;
public class Ej2{

	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner (System.in);
		int num1,num2;
		String comparar="";
		
		//Entrada de datos
		System.out.println("Por favor introduzca el primer número");
		num1=sc.nextInt();
		System.out.println("Introduzca el segundo número");
		num2=sc.nextInt();
		
		//Salida de datos
		comparar=(num1==num2)?"Son iguales":"No son iguales";
		System.out.println(comparar);
		
		comparar=(num1!=num2)?"Son distintos":"No son distintos";
		System.out.println(comparar);
		
		comparar=(num1<num2)?"El primero es menor que el segundo":"El primero no es menor que el segundo";
		System.out.println(comparar);
		
		comparar=(num1>num2)?"El primero es mayor que el segundo":"El primero no es mayor que el segundo";
		System.out.println(comparar);
		
		comparar=(num1<=num2)?"El primero es menor o igual que el segundo":"El primero no es menor o igual que el segundo";
		System.out.println(comparar);
		
		comparar=(num1>=num2)?"El primero es mayor o igual que el segundo":"El primero no es mayor o igual que el segundo";
		System.out.println(comparar);
	}
}