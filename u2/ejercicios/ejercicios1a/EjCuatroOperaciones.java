import java.util.Scanner; //Importe paquete con la clase de Scanner
public class EjCuatroOperaciones{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
			double num1; 
			double num2;
		
		//Inicialización
			System.out.println("Introduce el primer número ");
			num1=sc.nextDouble();
			System.out.println("Introduce el segundo número ");
			num2=sc.nextDouble();
			
		//Resolución
			double suma=num1+num2;
			System.out.println("La suma es "+suma);
			double resta=num1-num2;
			System.out.println("La resta es "+resta);
			double division=num1/num2;
			System.out.println("La división es "+division);
			double multiplicacion=num1*num2;
			System.out.println("La multiplicación es "+multiplicacion);
		}
	}