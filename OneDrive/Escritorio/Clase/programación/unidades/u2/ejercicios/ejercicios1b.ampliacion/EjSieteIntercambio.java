import java.util.Scanner; //Importe del paquete con la clase Scanner
public class EjSieteIntercambio{
	public static void main(String[]args){
		
		//Objetos y variables
		Scanner sc = new Scanner(System.in);
		String cad="",cad1="",cad2="";
		
		//Lee dos variables string por teclado e intercambia sus contenidos.
		
		System.out.println("Introduzca una cadena");
		cad1=sc.nextLine();
		System.out.println("Introduzca otra cadena");
		cad2=sc.nextLine();
	
		//Utilizaremos la variable cad para intercambiar contenido.
		cad=cad1;
		cad1=cad2;
		cad2=cad;
		
		
		System.out.printf("Primera cadena: %s\nSegunda cadena: %s",cad1,cad2);
	}
}