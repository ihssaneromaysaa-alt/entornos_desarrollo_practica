/* 5. Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los
elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a
la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente,
muestra el contenido del array.*/
import java.util.Scanner;
import java.util.Arrays;
public class Ej5{
	public static void main(String[] args) {
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int num[]=new int[5];//array original
		int numRotado[]=new int[5];//array auxiliar
		int i,j;//contadores

		//entrada array original
		System.out.println("Introduzca 10 números: ");
		for(i=0;i<num.length;i++){
			System.out.print(i+": ");
			num[i]=sc.nextInt();
		}
		
		//asignación de valores de el array auxiliar cambiando posiciones
		i=0;
		for(j=(numRotado.length-1);j>=0;j--){
			numRotado[i]=num[j];
			i++;
		}

		//salida del array original
		System.out.println("Original: "+Arrays.toString(num));
		for(i=0;i<num.length;i++){
			//asignación de los valores del array auxiliar al array original
			num[i]=numRotado[i];
		}
		System.out.println("Rotado: "+Arrays.toString(numRotado));

	}
}