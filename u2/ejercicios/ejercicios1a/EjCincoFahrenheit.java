import java.util.Scanner; //Importe paquete con la clase de Scanner
public class EjCincoFahrenheit{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
		double num;

		//Inicialización
			System.out.println("Introduce el número en grados Fahrenheit para\npasarlo a  grados Celsius ");
			num=sc.nextDouble();
		
		//Resolución
			double grados=(num-32)*5/9;
			System.out.println("El número "+num+" en grados es "+grados);
		}
	}