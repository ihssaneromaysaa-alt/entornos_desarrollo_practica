import java.util.Scanner; //Importe paquete con la clase de Scanner
public class EjCatorceInvertido{
	public static void main (String[]args){
		//Distancia entre dos números es la raíz cuadrada
		//de (x1-x2)^2+(y1-y2)^2
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int v1,v2;
		
			//Realización del problema
				System.out.println("Introduce la primera cifra del dato: ");
				v1=sc.nextInt();
				System.out.println("Introduce la segunda cifra del dato: ");
				v2=sc.nextInt();
				
			//Total
				System.out.println("\nEl invertido de "+v1+v2+" es "+v2+v1);
		}
	}