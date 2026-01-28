import java.util.Scanner;
public class Ej5{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		double num,num1;
		
		//Entrada
		System.out.print("Número: ");
		num=sc.nextDouble();
		
		//Operaciones
		if(num<100000){
			num=Math.floor(Math.abs(num)/Math.pow(10,Math.floor(Math.log10(num))));
			System.out.println((int)num);
			//Math.abs=Si es negativo cambia el signo.
			//Math.floor()=redondea hacia abajo.
			//Math.log10()=Logaritmo de 10 de x.
			//Logaritmo en base 10 de 100 es 2.
		}
		else
			System.out.print("No se admiten más de 5 cifras");

	}
}