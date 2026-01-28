import java.util.Scanner;
public class PruebaFor_While{
	public static void main(String[]args){
		
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int numero;
		int i;
		
		//Datos de entrada
		
		/*for(i=0;i<11;i++)
		//Ten en cuenta el signo de la condición!!
		{
			System.out.println(numero+"*"+i+" = "+numero*i);
		}*/
		do{
			System.out.println("Hola");
			System.out.print("Número: ");
			numero=sc.nextInt();
		}
		while(numero>=2);
		//Se ejecuta y luego comprueba si es true de nuevo.
		//El while no se ejecuta si no es true.
		
	}
}