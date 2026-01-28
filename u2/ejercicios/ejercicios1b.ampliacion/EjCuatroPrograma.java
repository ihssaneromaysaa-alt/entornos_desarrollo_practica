import java.util.Scanner; //Importe del paquete con la clase Scanner
public class EjCuatroPrograma{
	public static void main(String[]args){
	
	//Objetos y variables
	Scanner sc = new Scanner (System.in);
	String nombre;
	int tel;
	double estatura;
	char gen;
	
	//Entrada de datos
	System.out.println("Nombre:");
	nombre=sc.nextLine();
	
	System.out.println("Teléfono:");
	tel=sc.nextInt();
	sc.nextLine();
	
	System.out.println("Estatura:");
	estatura = Double.parseDouble(sc.nextLine());
	
	System.out.println("Género:");
	gen=sc.nextLine().charAt(0);
	
	//Salida
	System.out.printf("Nombre: %s \nTeléfono: %d \nEstatura: %.2f \nGénero: %c",nombre,tel,estatura,gen);
	
	}
}