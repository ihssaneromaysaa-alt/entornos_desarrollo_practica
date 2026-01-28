import java.util.Scanner;
public class EjUnoMayor{
	public static void main(String[]args){
		
		//Variables y objetos
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		//System.out.print("Hola");
		
		//Entrada
		System.out.println("Introduce un número:");
		n1=sc.nextInt();
		System.out.println("Introduce un segundo número:");
		n2=sc.nextInt();
		
		//Salida
		if(n1==n2){
			System.out.println(n1+" es igual a "+n2);
			if(n1>n2)
				System.out.printf("%d es mayor que %d\n",n1,n2);
			else
				System.out.printf("%d es menor que %d\n",n1,n2);
		}
		System.out.printf("Fin");
	}
}