import java.util.Scanner; //Importe del paquete con la clase Scanner
public class EjTresCadena{
	public static void main(String[]args){
	
	//Objetos y variables
	Scanner teclado=new Scanner (System.in);
	int a;
	char letra;
	String cadena;
	
	//Entrada de datos
	System.out.println("Introduzca una letra");
	letra=teclado.nextLine().charAt(0); //Conviertes un string a un char
	
	//En este caso solo selecciona el primer carácter.
	
	System.out.println("Introduzca una cadena");
	cadena=teclado.nextLine();
	
	System.out.println(letra+cadena);
	}
}