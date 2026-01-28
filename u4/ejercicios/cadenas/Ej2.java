import java.util.Scanner;
public class Ej2{
	public static void main(String[]args){

		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String nombre, direccion, telefonoo;

		System.out.print("Nombre:");
		nombre=sc.nextLine();
		System.out.print("Dirección:");
		direccion=sc.nextLine();
		System.out.print("Teléfono:");
		telefonoo=sc.nextLine();

		System.out.printf("\nNombre: %s\nDirección: %s\nTeléfono: %s\n",nombre,direccion,telefonoo);
	}
}