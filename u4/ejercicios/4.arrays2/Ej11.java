//repasar, mejorar la presentación de las 
//tablas con los índices
import java.util.Scanner;
import java.util.Arrays;
public class Ej11{
	public static void main(String[] args) {
		//objetos y variables
		Scanner sc=new Scanner(System.in);
		int[] num= new int[20];
		int[] indice= new int[20];
		int i,j, repuesto;

		//Entrada de valores
		for (i=0; i<num.length; i++) {
			//num[i]=sc.nextInt();
			num[i]=(int)(Math.random()*(100-0)+1);
			indice[i]=i+1;
		}

		//System.out.println(Arrays.toString(num));
		System.out.printf("\níndice:         "+Arrays.toString(indice));
		System.out.println("\nArray ordenado: "+Arrays.toString(num));
		//Ordenamos(Primero los primos, luego los no primos)
		//dos contadores para primos y no primos
		i=0; //para números primos
		j=num.length-1;//para números no primos
		while(i<j){
			while(i<j && esPrimo(num[i]))
				i++;
			while(i<j && !esPrimo(num[j]))
				j--;
			if(i<j){
				repuesto=num[j];
				num[j]=num[i];
				num[i]=repuesto;
				i++;
				j--;
			}
		}
		
		System.out.printf("\níndice:         "+Arrays.toString(indice));
		System.out.println("\nArray ordenado: "+Arrays.toString(num));
	}
	public static boolean esPrimo(int n) {
		    //los números menores o iguales a 1 no son primos
		    if (n <= 1 || n % 2 == 0)
		        return false;
		    //el 2 es primo
		    if (n == 2)
		        return true;
		    //probamos divisores impares hasta la raíz cuadrada de n
		    for (int i = 3; i * i <= n; i += 2) {
		        if (n % i == 0) {
		            return false;  // Encontró un divisor → no primo
		        }
		    }
		    return true;  // No encontró divisores → es primo
	}
}