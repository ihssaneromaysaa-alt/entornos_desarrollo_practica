import java.util.Scanner;
public class EjUnoFactorial2{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int num, i, resultado=1;
		
		//Datos de entrada
		System.out.print("Número: ");
		num=sc.nextInt();
		
		//Salida
		System.out.print(num+"! = ");
		for (i=1; i<= num; i++) {
			System.out.print(i);
			resultado *= i;
			//variable acomuladora
			
			if (i < num) {
				System.out.print("x");
			}
		}
		System.out.println(" = " + resultado);
	}
}