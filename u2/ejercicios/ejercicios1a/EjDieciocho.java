import java.util.Scanner; //Importe paquete con la clase de Scanner
public class EjDieciocho{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		
		//Variables
		String nombre;
		String apellido1;
		String apellido2;
		
		//Realización del problema
		System.out.println("Introduce tu nombre: ");
		nombre=sc.nextLine();
		System.out.println("Introduce tu primer apellido: ");
		apellido1=sc.nextLine();
		System.out.println("Introduce tu segundo apellido: ");
		apellido2=sc.nextLine();
			
		//Total
		System.out.println("Tus iniciales son "+Character.toUpperCase(nombre.charAt(0))+Character.toUpperCase(apellido1.charAt(0))+Character.toUpperCase(apellido2.charAt(0)));
		}
	}