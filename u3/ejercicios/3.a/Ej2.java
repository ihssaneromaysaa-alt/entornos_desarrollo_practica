import java.util.Scanner;
public class Ej2{
	public static void main(String[]args){
	
		//Objetos y variables
		double a=0,b,resultado=0;
		String inicio;
		Scanner sc=new Scanner(System.in);

		do{
			System.out.println("\nEste programa resuelve ecuaciones de primer\ngrado del tipo ax + b = 0");
			System.out.print("Pulse 's' para salir");
			inicio=sc.nextLine().toLowerCase();
			if(inicio.equals("s"))
				System.out.print("Fin del programa");
			else{
				try{
					//Entrada
					System.out.print("Por favor, introduzca el valor de a: ");
					a=sc.nextDouble();
					System.out.print("Ahora introduzca el valor de b: ");
					b=sc.nextDouble();
					
					//Operación
					resultado=-b/a;
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
					if(a!=0)
						System.out.printf("\nx = %.1f",resultado);
					else
						System.out.printf("\nEsa ecuación no tiene solución real.");			
				}
			}
		}
		while(!inicio.equals("s"));
		//Diferenciar comillas de carácteres '' y comillas de String
	}
}