import java.util.Arrays;
public class Ej12{
	public static void main(String[] args) {
		//objetos y variables
		int[] num={2,5,9,-4,6};
		int[] num2=new int[10];//quiero llenar este array con menos 1

		System.out.println("Original: "+Arrays.toString(num));
		//método estático
		Arrays.sort(num);//Los ordena
		System.out.println("Ordenado: "+Arrays.toString(num));	

		Arrays.fill(num2,-1);
		System.out.println("Nuevo array 2: "+Arrays.toString(num2));
		//buscar un elemento en el arrray, me devuelve la posición
		//si no lo encuentra, devuelve la longitud del array en negativo
		System.out.println("El 9 en el num está en la posición: "+Arrays.binarySearch(num,100));
		
		System.out.println("The first arrays is the same as the second: "+Arrays.equals(num,num2));
	}
}