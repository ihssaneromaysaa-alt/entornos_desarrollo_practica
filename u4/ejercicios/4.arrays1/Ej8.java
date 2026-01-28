import java.util.Scanner;
import java.util.Arrays;
public class Ej8{
	public static void main(String[] args) {
		//Objetos y variables
		Scanner sc= new Scanner(System.in);
		double[] temp=new double[12];
		
		int i;

		for(i=0;i<temp.length;i++){
			System.out.print("Introduzca la temperatura del mes "+i+": ");
			temp[i]=Math.floor(Math.random()*(20-(-20)+1)+-20);
			System.out.println(temp[i]+" ");
			//temp[i]=sc.nextInt();
		}
		System.out.println();
		
		//Diagrama
		System.out.println("");
		for(int j=0;j<temp.length;j++){
			System.out.print("Mes "+j+": ");
			if(temp[j]>0 && j<10){
				System.out.print("                     |");
			}
			else if (temp[j]>0) {
					System.out.print("                    |");
			}
			else if(temp[j]<0){
				for(i=0;i<(20+(int)temp[j]);i++)
					System.out.print(" ");
			}
			/*
			Tenemos temp[i]: por ejemplo a -16
			20-16=i=4
			System.out.println(" ");*/
			for(i=0;i<(int)Math.abs(temp[j]);i++){
				if(temp[j]>0){
					System.out.print("*");
				}
				else
					System.out.print("^");	
			}
			if(temp[j]<0){
				System.out.print("|");
			}
			System.out.println();
		}
	}
}