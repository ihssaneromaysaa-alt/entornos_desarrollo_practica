import java.util.Scanner;
public class a{
	public static void main(String[]args){
		
		//variables
		int x;
		Scanner sc = new Scanner(System.in);
		
		//salida
		System.out.printf("Help, dime un número de 3 cifras para invertirlo");
		
		//entrada
		x=sc.nextInt();
		
		//solución
		System.out.printf("Tu número invertido es "+(x/1)+(x/10)+(x/100));
		}
	}