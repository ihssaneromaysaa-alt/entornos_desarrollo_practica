import java.util.Scanner; //Importe del paquete con la clase Scanner
public class EjDosOperaciones{
	public static void main(String[]args){
		
		//Objetos y variables
		Scanner teclado = new Scanner(System.in);
		int a,b;
		boolean c;
		
		//Comienzo del programa, asignación de valores de entrada:
		System.out.printf("Introduzca el primer número para las operaciones\n");
		a=teclado.nextInt();
		System.out.printf("Introduzca el segundo número\n");
		b=teclado.nextInt();
		
		//Operaciones
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
		
		}
	}