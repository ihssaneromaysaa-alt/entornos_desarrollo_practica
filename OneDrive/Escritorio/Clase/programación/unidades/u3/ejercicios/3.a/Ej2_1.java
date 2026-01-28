import java.util.Scanner;
public class Ej3{
	public static void main(String[]args){
	
		//Objetos y variables
		double a=0,b,c,resultado1=0,resultado2=0;
		Scanner sc=new Scanner(System.in);

		try{
			//Entrada
			System.out.println("Este programa resuelve ecuaciones de segundo grado.");
			System.out.print("Por favor, introduzca el valor de a: ");
			a=sc.nextDouble();
			System.out.print("Ahora introduzca el valor de b: ");
			b=sc.nextDouble();
			System.out.print("Ahora introduzca el valor de c: ");
			c=sc.nextDouble();
			
			//Operaciones
			resultado1=(-b+Math.sqrt((Math.pow(b,2)-4*a*c)))/2*a;
			resultado2=(-b-Math.sqrt((Math.pow(b,2)-4*a*c)))/2*a;
			//menos b más menos raiz cuadrada de b al cuadrado menos cuatro
			//por a por c
			//TODO eso entre 2 poa a
		}
		catch(ArithmeticException e){
			System.out.print("ERROR: No se puede dividir entre 0");
		}
		catch(NumberFormatException e){
			System.out.print("ERROR");
		}
		catch(Exception e){
			System.out.print("ERROR");
		}
		finally{
			//Salida
			if(a!=0){
				System.out.printf("\nx1 = %.1f",resultado1);
				System.out.printf("\nx2 = %.1f",resultado2);
			}
			else
				System.out.printf("\nEsa ecuación no tiene solución real.");			
		}
	}
}