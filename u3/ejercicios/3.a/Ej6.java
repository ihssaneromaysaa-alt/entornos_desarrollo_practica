import java.util.Scanner;
public class Ej6{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		double notaObs=0,notaPra=0,notaPru=0,nota=0;
		
		
		
		do{
			try{
			//Entrada
			System.out.print("Introduzca la nota de la Observación directa y ejercicios de clase:");
			notaObs=sc.nextDouble();
			System.out.print("Introduzca la nota de la Practicas:");
			notaPra=sc.nextDouble();
			System.out.print("Introduzca la nota de las Pruebas Específicas:");
			notaPru=sc.nextDouble();
			}
			catch(Exception e){
			System.out.print("ERROR");
			}
		}while(notaObs>10||notaObs<0||notaPra>10||notaPra<0||notaPru>10||notaPru<0);
		//Problema
		nota=0.1*notaObs+0.3*notaPra+0.6*notaPru;
		if(notaPru<5 && nota>4)
			nota=4;
		
		//Salida
		System.out.println("\n\n\n**Instrumentos de evaluación*****************Abreviatura**%***");
		System.out.println("**Observación directa y ejercicios de clase**ODyEC********10**");
		System.out.println("**Practicas**********************************PR***********30**");
		System.out.println("**Pruebas Específicas************************PE***********60**");
		System.out.println("**Nota****************************************************"+nota+"*");
	}
}