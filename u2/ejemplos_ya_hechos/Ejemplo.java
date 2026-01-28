import java.util.Scanner;
public class Ejemplo{
	public static void main (String[]args){
		
		//Variables
		int a,b=5,c;
		
		//Pedir el valor
		System.out.print("El primer número es "+b+"\nIntroduce un valor para a y los sumaremos.");
		
		//Creamos un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		//Coger el valor
		a=sc.nextInt();
		
		//Sumamos las variables.
		c=a+b;
		
		//b+=a; //10+5
		//b+=a++; //b=10+5 y a=a+1
		//b+=++a; //a=a+1 y b=b+a
		
		System.out.print("\nLa suma de "+a+" y "+b+" es "+c);
		}
	}