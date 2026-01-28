import java.util.Scanner;
public class Menu{
	public static void main(String[]args){
	
		//Variables
		Scanner sc=new Scanner(System.in);
		double variable1,variable2,resultado;
		int numero;
		
		//Resolución
		System.out.println("Escriba el primer número");
		variable1=sc.nextDouble();
		System.out.println("Escriba el segundo número");
		variable2=sc.nextDouble();
		System.out.println("Eliga: \n1-Sumar \n2-Restar \n3-Multiplicar \n4-Dividir");
		numero=sc.nextInt();
		
		//SWITCH
		switch(numero){
			case 1:
				resultado=variable1+variable2;
				System.out.println(variable1+" + "+variable2+" = "+resultado);
			break;
			case 2:
				resultado=variable1-variable2;
				System.out.println(variable1+" - "+variable2+" = "+resultado);
			break;
			case 3:
				resultado=variable1*variable2;
				System.out.println(variable1+" * "+variable2+" = "+resultado);
			break;
			case 4:
				resultado=variable1/variable2;
				System.out.println(variable1+" / "+variable2+" = "+resultado);
			break;
			default:
				System.out.println("Opción inválida");
		}
	}
}