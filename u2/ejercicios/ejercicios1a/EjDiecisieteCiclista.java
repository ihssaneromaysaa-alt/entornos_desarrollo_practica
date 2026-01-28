import java.util.Scanner;
public class EjDiecisieteCiclista{
	public static void main(String[]args){
		
		//variables y objetos
		int h,m,s,t;
		int h1,m1,s1;
		Scanner sc = new Scanner(System.in);
		
		//salida
		System.out.println("El ciclista sale de la ciudad A dime a la hora a la que sale:");
		h=sc.nextInt();
		System.out.println("Introduzca los minutos a los que sale");
		m=sc.nextInt();
		System.out.println("Introduzca los segundos a los que sale:");
		s=sc.nextInt();
		System.out.println("Ahora introduzca los segundos que tarda el ciclista en llegar a la ciudad B");
		t=sc.nextInt();
		
		//resolver el problema
		t+=+h*360+m*60+s;
		h1=(t/3600)%24; 
		m1=(t%3600)/60;
		s1=t%60;
		
		System.out.printf("El ciclista llega a "+h1+" horas "+m1+" minutos "+s1+" segundos a la ciudad B");
		}
	}