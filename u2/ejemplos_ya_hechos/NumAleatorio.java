//Número aleatorio
import java.util.Scanner;
public class NumAleatorio{
	public static void main(String[]args){
	/*	int numero=(int)(Math.random()*(10-0+1)+1);
		System.out.println("Número entre el 10 y el 0");
		System.out.println("El número es \n"+numero);
	*/
		double numero=2.56;
		System.out.println("El número es \n"+numero);
		
		System.out.println("Redondearemos "+numero);
		
		System.out.println("Math.round() "+Math.round(numero));
		//3 Redondea normalmente según los decimales
		System.out.println("Math.ceil() "+Math.ceil(numero));
		//3.0 Redondea hacia arriba
		System.out.println("Math.floor() "+Math.floor(numero));
		//2.0 Corta los decimales
	}
}