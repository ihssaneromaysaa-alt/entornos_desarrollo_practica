import java.util.Scanner;
//Se me había olvidado esta línea entera
public class NuevoArchivo{
	//Se me había olvidado esta línea entera
	public static void main(String[]args){
		//Se me había olvidado esta línea entera
		Scanner sc = new Scanner(System.in);
		//Se me había olvidado esta línea entera
		
		//Variables
		String nom;
		//Se me había olvidado que no hay sc.nextChar
		//asi que siempre hay que poner una variable String
		
		//Programa
		System.out.println("Escribe tu nombre:");
		//Se me había olvidado el System.out
		nom=sc.nextLine();
		//Se me había olvidado el sc.
		System.out.print("Hola "+nom);
		}
	}