/*calcular la denominación ordinal de los 
reyes de una secuencia histórica??
solicitar la cantidad de reyes que se van a introducir
y dsps se reciben los nombres de los reyes
presentar por pantalla dichos nombres colocándoles el ordinal 
correspondiente 

*/ import java.util.Scanner;
public class Ej20{
	public static void main(String [] args){
		//objetos y variables
		Scanner sc=new Scanner (System.in);
		int numReyes,i,j, contador;

		System.out.print("Introduzca el número total de reyes: ");
		numReyes=sc.nextInt();
		sc.nextLine();

		String[] reyes=new String[numReyes];

		for (i=0; i<reyes.length; i++)
			reyes[i]=sc.nextLine().trim();

		System.out.print("Los reyes introducidos son: \n");
		for (i=0; i<reyes.length; i++) {
			contador=1;
			//contamos las veces que ha estado antes el nombre
			for (j=0; j<i; j++) {
				if(reyes[j].equalsIgnoreCase(reyes[i]))
					contador++;
			}
			System.out.println(reyes[i]+" "+contador+"º");
		}
	}
}