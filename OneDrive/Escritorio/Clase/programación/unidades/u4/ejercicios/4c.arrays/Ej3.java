import java.util.Scanner;
public class Ej3{
	public static void main(String[] args) {
		//Objetos y variables
		int[] numero=new int[20];
		int[] cuadrado=new int[20];
		int[] cubo=new int[20];
		int i, num;

		System.out.println("---------------------------");
		System.out.println("| número |  cubo  |   cubo|");
		System.out.println("---------------------------");

		for(i=0;i<numero.length;i++){
			numero[i]=(int)(Math.random()*(100-0+1)+0);
			num=(int)numero[i];
			cuadrado[i]=(int)Math.pow(num,2);
			cubo[i]=(int)Math.pow(num,3);
			System.out.printf("|  %3d|   %4d|   %8d|\n",numero[i],cuadrado[i],cubo[i]);
		}
			
		System.out.println("---------------------------");
	}
}