import java.util.Scanner; //Importe paquete con la clase de Scanner
public class EjTreceElevado{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int x;
		
			//Realización del problema
				System.out.println("Introduce el valor que quieres elevar al cuadrado y al cubo: ");
				x=sc.nextInt();
				
				
			//Total
				System.out.println("La raíz cuadrada de"+x+" es "+Math.pow(x,1/2.0)+"\n y la raíz cúbica es "+Math.pow(x,1/3.0));
		}
	}