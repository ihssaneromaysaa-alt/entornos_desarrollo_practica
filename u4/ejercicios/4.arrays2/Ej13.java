import java.util.Scanner;
import java.util.Arrays;
public class Ej13{
	public static void main(String[] args) {
		//objetos y variables
		Scanner sc=new Scanner(System.in);
		int i, opcion, min, max;
		int[] num=new int[100];

		for (i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*(500-0)-0);
		}
		System.out.println("Mostrando array: ");
		for (i=0; i<num.length; i++) {
			System.out.print(num[i]+ " ");
		}
		System.out.println("\nDecida si quierre destacar el máximo o el mínimo del array mostrado:");
		System.out.print("\n(0. mínimo)");
		System.out.println("\n(1. máximo)");
		opcion=sc.nextInt();

		if(opcion==0 || opcion==1){
			if (opcion==0) {
				//buscando mínimo:
				min=num[0];
				for (i=0; i<num.length; i++) {
					if(num[i]<min)
						min=num[i];
				}
				for (i=0; i<num.length; i++) {
					if(num[i]==min)
						System.out.print("*"+num[i]+ "* ");
					else 
						System.out.print(num[i]+ " ");
				}
			}
			if (opcion==1) {
				max=num[0];
				for (i=0; i<num.length; i++) {
					if(num[i]>max)
						max=num[i];
				}
				for (i=0; i<num.length; i++) {
					if(num[i]==max)
						System.out.print("*"+num[i]+ "* ");
					else 
						System.out.print(num[i]+ " ");
				}
			}
		}
		else
			System.out.print("Debe elegir entre 0 o 1.");
	}
}