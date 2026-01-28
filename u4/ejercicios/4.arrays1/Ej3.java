import java.util.Scanner;
public class Ej3{
	public static void main(String[] args) {
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int num[]=new int[11];
		int i;

		System.out.println("Introduzca 10 números: ");
		for(i=0;i<num.length;i++){
			System.out.print(i+": ");
			num[i]=sc.nextInt();
		}
		System.out.println("Ahora te los mostraré en orden inverso: ");
		for(i=10;i>=0;i--)
			System.out.println(num[i]);
	}
}