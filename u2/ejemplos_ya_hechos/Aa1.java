import java.util.Scanner;
public class Aa1{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//Variables
	int base;
	int altura;
	
	System.out.print("Introduzca la base del rectángulo");
	base=sc.nextInt();
	System.out.print("Introduzca la altura del rectángulo");
	altura=sc.nextInt();
	
	System.out.print("El perímetro de tu rectángulo es "+(base*2+altura*2)+" y el área de tu rectángulo es"+(base*altura));
	}
}