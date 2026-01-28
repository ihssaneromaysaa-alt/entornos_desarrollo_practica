import java.util.Scanner; //Importe paquete con la clase de Scanner
public class Hipotenusa{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
		double c1; 
		double c2;
		
			//Objetos
			//Catetos
				System.out.println("Introduce la longitud del primer cateto ");
				c1=sc.nextDouble();
				System.out.println("Introduce la longitud del segundo cateto ");
				c2=sc.nextDouble();
				
			//Hipotenusa
				//Math.sqrt es para raices cuadradas y Math.pow para elevadas.
				double hipotenusa=Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
				System.out.println("La hipotenusa es "+hipotenusa);
		}
	}