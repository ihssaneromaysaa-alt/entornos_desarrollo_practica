import java.util.Scanner; //Importe del paquete con la clase Scanner
public class EjDiezEnumerado{
	public enum Razas{Mastín,Terrier,Bulldog,Pekines,Caniches,Galdo}
	public static void main(String[]args){
	
	//Objetos y variables
	Scanner sc = new Scanner (System.in);
	String comparar;
	Razas var1=Razas.Mastín;
	Razas var2=Razas.Terrier;
	
	
	comparar=(var1==var2)?"Son iguales":"No son iguales";
	
	System.out.println("¿Es "+var1+" == "+var2+" ? "+comparar);
	System.out.println("La posición de "+var1+" es "+var1.ordinal());
	System.out.println("La posición de "+var2+" es "+var2.ordinal());
	
	}
}