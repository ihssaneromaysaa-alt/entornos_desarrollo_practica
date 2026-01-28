import java.util.Scanner;
public class Ej4{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String nombre;
		int tel;
		double estatura;
		char genero;
		
		//Entrada de datos
		System.out.println("Nombre: ");
		nombre=sc.nextLine();
		
		System.out.print("\nTeléfono: ");
		tel=sc.nextInt();
		sc.nextLine();
		
		System.out.println("\nEstatura: ");
		estatura=Double.parseDouble(sc.nextLine());
		
		System.out.println("\nGénero: ");
		genero=sc.nextLine().charAt(0);
		
		//Salida de datos
		System.out.printf("Nombre: %s\nTeléfono: %d\nEstatura: %.2f\nGénero: %c\n",nombre,tel,estatura,genero);
	}
}