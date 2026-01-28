import java.util.Scanner; //Importe del paquete con la clase Scanner
public class EjTresPar{
	public static void main(String[]args){
	
	//Variables y objetos
	Scanner sc=new Scanner(System.in);
	int num;
	
	//Entrada
	System.out.println("Introduzca un número");
	num=sc.nextInt();
	
	//Salida
	if(num%2==0)
		System.out.println("El número indicado es par");
	else
		System.out.println("El número introducido es impar");
	System.out.print("Fin del programa");
	}
}