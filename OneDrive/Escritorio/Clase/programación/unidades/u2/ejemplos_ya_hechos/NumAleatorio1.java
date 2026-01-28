import java.util.Scanner;
public class NumAleatorio1{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner (System.in);
		int min,max;
		double aleatorio;
		
		System.out.println("Introduzca el mínimo para el número random");
		min=sc.nextInt();
		System.out.println("Introduzca el máximo para el número random");
		max=sc.nextInt();
		
		aleatorio=(double)(Math.random()*(max-min+1)+min);
		System.out.println("Número aleatorio: "+aleatorio);
	
		System.out.println("El número redondeado: "+Math.round(aleatorio));
		System.out.println("El número redondeado hacia arriba: "+Math.ceil(aleatorio));
		System.out.println("El número sin decimales: "+Math.floor(aleatorio));
	}
}