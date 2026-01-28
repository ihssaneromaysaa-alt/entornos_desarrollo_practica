import java.util.Scanner; //Importe paquete con la clase de Scanner
public class EjDoceDistancia{
	public static void main (String[]args){
		//Distancia entre dos números es la raíz cuadrada
		//de (x1-x2)^2+(y1-y2)^2
		Scanner sc = new Scanner(System.in);
		
		//Variables
		double v1,v2,v3,v4,r1,r2,r3,r4,total;
		
			//Realización del problema
				System.out.println("Introduce la primera coordenada de x: ");
				v1=sc.nextDouble();
				System.out.println("Introduce la segunda coordenada de x: ");
				v2=sc.nextDouble();
				System.out.println("Introduce la primera coordenada de y: ");
				v3=sc.nextDouble();
				System.out.println("Introduce la segunda coordenada de y: ");
				v4=sc.nextDouble();
				
			//Resultados
				//Math.sqrt es para raices cuadradas y Math.pow para elevadas.
				r1=(v2-v1);
				r2=(v4-v3);
				
				r3=Math.pow(r1,2);
				r4=Math.pow(r2,2);
				
			//Total
				total=Math.sqrt(r3+r4);
				System.out.println("La distancia total es "+total);
				System.out.println("\nLa distancia total es "+Math.sqrt(Math.pow((v2-v1),2)+Math.pow((v4-v3),2)));
		}
	}