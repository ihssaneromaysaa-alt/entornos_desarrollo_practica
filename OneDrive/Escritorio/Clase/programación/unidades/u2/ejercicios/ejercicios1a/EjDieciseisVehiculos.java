import java.util.Scanner;
public class EjDieciseisVehiculos{
	public static void main(String[]args){
		
		//variables y objetos
		double v1,v2,d,t;
		Scanner sc = new Scanner(System.in);
		//v1>v2
		
		//salida
		System.out.println(" Escribe la velocidad del primer vehículo");
		v1=sc.nextDouble();
		System.out.println(" Escribe la velocidad del segundo vehículo");
		v2=sc.nextDouble();
		System.out.println(" Escribe la distancia entre los vehículos");
		d=sc.nextDouble();
		
		//resolver el problema
		//Δv=Δd/Δt
		//Δt=Δd/Δv
		//Δv=v1-v2
		
		t=d/(v1-v2);
		
		//tiempo en horas se cambia a minutos
		
		t=t*60;
		
		System.out.printf("El tiempo que tarda son "+t+" minutos");
		}
	}