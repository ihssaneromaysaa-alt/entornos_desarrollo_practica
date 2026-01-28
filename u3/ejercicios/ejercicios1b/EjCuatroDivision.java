import java.util.Scanner;
public class EjCuatroDivision{
	public static void main(String[]args){
	
		//Objetos y variable
		Scanner sc=new Scanner(System.in);
		double n1,n2;
		
		System.out.println("Introduzca un número real");
		n1=sc.nextDouble();
		System.out.println("Introduzca otro número real");
		n2=sc.nextDouble();
		
		if(n2==0){
			System.out.println("No se puede dividir entre 0");
		}
		else {
			System.out.println(n1+"/"+n2+" = "+n1/n2);
		}
	}
}