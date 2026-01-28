import java.util.Scanner; //Importe paquete con la clase de Scanner
public class EjTresRectangulo{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
		double a; 
		double b;
		
			//Objetos
			//Perímetro
				System.out.println("Introduce la base del rectangulo ");
				b=sc.nextDouble();
				System.out.println("Introduce la altura del rectangulo ");
				a=sc.nextDouble();
				System.out.println("Perímetro del rectángulo "+((2*b)+(2*a)));
		
			//Area
				System.out.println("Area del rectángulo "+b*a);
		}
	}
