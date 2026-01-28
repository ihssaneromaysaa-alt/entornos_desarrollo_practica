import java.util.Scanner;
public class Ej8{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		double radio,area;
		
		//Entrada de datos
		System.out.println("Introduzca el radio");
		radio=sc.nextDouble();
		
		//Operaciones
		area=Math.PI*Math.pow(radio,2);
		
		//Resultado
		System.out.println("area=pi*radio^2");
		System.out.println("area= "+area);
	}
}