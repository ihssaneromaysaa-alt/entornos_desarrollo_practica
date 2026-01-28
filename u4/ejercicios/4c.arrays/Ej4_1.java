//10 valores que me salga el máximo y el mínimo entre comillas

import java.util.Scanner;
public class Ej4_1{
	public static void main(String[] args) {
		//objetos y variables
		Scanner sc=new Scanner(System.in);
		String[] num=new String[10];
		int max=0,min=0;
		int i;
		System.out.println("Introduzca 10 valores:");
		for (i=0;i<num.length ;i++ ) {
			num[i]=Integer.parseInt(sc.nextLine());
			if(num[num.length-1]!=""){
				min=num[0];
				if(num[i]>max)
					max=num[i];
				else if(num[i]<min)
					min=num[i];
				if(num[i]==max)
					System.out.println(num[i]+" (máximo)");
				else if(num[i]==min)
					System.out.println(num[i]+" (mínimo)");
				else
					System.out.println(num[i]);
			}
		}
	}
}