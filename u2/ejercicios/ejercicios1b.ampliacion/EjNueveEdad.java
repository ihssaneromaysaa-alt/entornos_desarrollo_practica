import java.util.Scanner; //Importe del paquete con la clase Scanner
public class EjNueveEdad{
	public static void main(String[]args){
	
	//Objetos y variables
	Scanner sc = new Scanner (System.in);
	int edad;
	String resultado;
	
	System.out.printf("Introduzca una edad\n");
	edad=sc.nextInt();
	
	resultado=(edad>=18)? "Mayor de edad":"Menor de edad";
	System.out.printf("Segun la edad introducida se indica que es  %s",resultado);
	}
}