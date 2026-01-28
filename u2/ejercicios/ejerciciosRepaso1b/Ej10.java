import java.util.Scanner;
public class Ej10{
	public enum Raza{Mastín, Terrier, Bulldog, Pekines, Caniche, Galgo}
	public static void main(String[]args){
	
		//Objetos y variables
		Raza var1=Raza.Mastín;
		Raza var2=Raza.Terrier;
		String resultado;
		
		resultado=(var1==var2)?"Son iguales":"No son iguales";
		System.out.print(resultado);
		System.out.print("posición de var1: "+var1.ordinal());
		System.out.print("posición de var2: "+var2.ordinal());
		
	}
}