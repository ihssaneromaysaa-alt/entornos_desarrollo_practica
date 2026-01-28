import java.util.Scanner; //Importe del paquete con la clase Scanner
public class EjDosOperaciones{
	public static void main(String[]args){
		
		//Objetos y variables
		Scanner teclado = new Scanner(System.in);
		int a,b;
		boolean c;
		
		//Comienzo del programa, asignación de valores de entrada:
		System.out.printf("Introduzca el primer número para las operaciones\n");
		a=Integer.parseInt(teclado.nextLine());//Utilizar parseInt
		System.out.printf("Introduzca el segundo número\n");
		b=Integer.parseInt(teclado.nextLine());
		
		//Operaciones, salida de datos.
		c=a==b;
		System.out.println(" "+a+" == "+b+" "+c);
		
		c=a!=b;
		System.out.println(" "+a+" != "+b+" "+c);
		
		c=a<b;
		System.out.println(" "+a+" < "+b+" = "+c);
		
		c=a>b;
		System.out.println(" "+a+" > "+b+" = "+c);
		
		c=a<=b;
		System.out.println(" "+a+" <= "+b+" = "+c);
		
		c=a>=b;
		System.out.println(" "+a+" >= "+b+" = "+c);
		
		//Fin del programa
		System.out.printf("Fin del programa.");
		
		}
	}