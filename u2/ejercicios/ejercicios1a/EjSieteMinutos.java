import java.util.Scanner; //Importe paquete con la clase de Scanner
public class EjSieteMinutos{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int minutos;
		double resultado;
		
		//Inicialización
			System.out.println("Introduce una cantidad entera de minutos para convertirla a horas:");
			minutos=sc.nextInt();
			
		//Resolución
			
			resultado=minutos/60.0;
			System.out.println(minutos+" son "+resultado+"horas y "+((resultado-1)*0.6)+"minutos");
			
			//es 1.67 horas
			//67-minutos en 100
			//x es minutos en 60
		}
	}