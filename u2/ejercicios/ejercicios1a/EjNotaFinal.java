import java.util.Scanner;
public class EjNotaFinal{
	public static void main(String[]args){
		
		//variables y objetos
		double a,b,aux;
		Scanner sc = new Scanner(System.in);
		
		//salida
		System.out.println(" Introduzca una variable para asignar a A");
		a=sc.nextInt();
		
		System.out.println(" Introduzca una variable para asignar a B");
		b=sc.nextInt();
		
		//resolver el problema
		aux=a;
		a=b;
		b=aux;
		
		System.out.printf("Variables intercambiadas exitosamente \n A es %.2f B es %.2f",a,b);
		}
	}