import java.util.Scanner;
public class EjDiecinueveNotaFinal{
	public static void main(String[]args){
		
		//variables y objetos
		int rc,ri/*,total*/;
		Scanner sc = new Scanner(System.in);
		
		//salida
		System.out.println("Calcularemos la nota final de un estudiante.");
		System.out.println("Introduzca el número de respuestas correctas.");
		rc=sc.nextInt();
		System.out.println("Introduzca el número de respuestas incorrectas.");
		ri=sc.nextInt();
		
		
		//resolver el problema
		//total=rc*5+(-1)*ri;
		//System.out.printf("La nota final del estudiante es "+total);
		System.out.printf("La nota final del estudiante es "+(rc*5+(-1)*ri));
		}
	}