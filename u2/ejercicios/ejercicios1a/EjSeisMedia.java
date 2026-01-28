import java.util.Scanner; //Importe paquete con la clase de Scanner
public class EjSeisMedia{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
		double num1;
		double num2;
		double num3;

		//Inicialización
			System.out.println("Introduce tres números para realizar la media:");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			num3=sc.nextDouble();
		
		//Resolución
			System.out.println("La media de "+num1+", "+num2+", "+num3);
			System.out.println("es "+((num1+num2+num3)/3));
		}
	}