import java.util.Scanner; //Importe paquete con la clase de Scanner
public class EjDoceDistancia1{
	public static void main (String[]args){
		//Distancia entre dos números es la raíz cuadrada
		//de (x1-x2)^2+(y1-y2)^2
		Scanner sc = new Scanner(System.in);
		
		//Variables
		double v1,v2,v3,v4,r1,r2,r3,r4,total,var1,var2;
		
			//Realización del problema
				System.out.println("Introduce la primera coordenada de x: ");
				var1=sc.nextDouble();
				System.out.println("Introduce la segunda coordenada de x: ");
				var1=sc.nextDouble()-var1;
				System.out.println("Introduce la primera coordenada de y: ");
				var2=sc.nextDouble();
				System.out.println("Introduce la segunda coordenada de y: ");
				var2=sc.nextDouble()-var2;
				
				
			//Total
				//Math.sqrt es para raices cuadradas y Math.pow para elevadas.
				System.out.println("\nLa distancia total es "+Math.sqrt(Math.pow((var1),2)+Math.pow((var2),2)));
		}
	}