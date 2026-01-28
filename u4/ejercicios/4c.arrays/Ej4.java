//10 valores que me salga el máximo y el mínimo entre comillas

import java.util.Scanner;
public class Ej4{
	public static void main(String[] args) {
		//objetos y variables
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		int[] numAux=new int[10];
		int max=0,min=0;
		int i;
		System.out.println("Introduzca 10 valores:");
		for (i=0;i<num.length ;i++ ) {
			num[i]=sc.nextInt();
		}
		min=num[0];
		for (i=0;i<num.length ;i++ ) {
			if(num[i]>max)
				max=num[i];
			else if(num[i]<min)
				min=num[i];
		}
		for(i=0;i<num.length;i++){
			if(num[i]==max)
				System.out.println(num[i]+" máximo");
			else if(num[i]==min)
				System.out.println(num[i]+" mínimo");
			else
				System.out.println(num[i]);
		}
	}
}