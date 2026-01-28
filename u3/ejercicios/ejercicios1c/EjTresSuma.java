import java.util.Scanner;
public class EjTresSuma{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc = new Scanner(System.in);
		double num=1,suma=0, media;
		int contador=0;
		
		//Estructura repetitiva
		while(num!=0){
			//Datos de entrada
			System.out.print("Introduzca un número ");
			num=Double.parseDouble(sc.nextLine());
			suma+=num;
			contador++;
		}
		//System.out.print("\n"+contador);
		media=(double)(suma/(contador-1));
		
		//Datos de salida
		System.out.printf("Suma= %.1f\nMedia=%.1f",suma,media);
	}
}