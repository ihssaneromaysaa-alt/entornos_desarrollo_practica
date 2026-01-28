import java.util.Scanner;
public class EjUnoFactorial{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int num, i;
		long resultado=1;
		
		//Datos de entrada
		System.out.print("Número: ");
		num=sc.nextInt();
		
		//Salida
		System.out.print(num+"! = ");

		if(num<=20){
			for (i=1; i <= num; i++) {
				System.out.print(i);
				resultado *= (long) i;

				if (i < num) {
					System.out.print("x");
				}
			}
		System.out.println(" = " + resultado);
		}
		else{
			System.out.println("Este programa está hecho con long,");
			System.out.println("no es capaz de soportar más de el número 20");
		}
	}
}