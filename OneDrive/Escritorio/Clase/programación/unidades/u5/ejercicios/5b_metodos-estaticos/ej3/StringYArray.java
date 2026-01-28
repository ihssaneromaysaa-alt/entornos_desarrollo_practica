import java.util.Scanner;
import java.util.Arrays;
public class StringYArray{
	public static String concatenar(String frase1, String frase2){
		String frase=frase1+frase2;
		return frase;
	}
	public static char[] cadenaAArray(String frase){
		char[] array= new char[frase.length()];
		for (int i=0; i<frase.length(); i++)
			array[i]=frase.charAt(i);
		return array;
	}
	public static String convierteArrayEnString(int[] a){
		String cadena="";
		for (int i=0; i<a.length; i++) {
			cadena+=Integer.toString(a[i]);
		}
		return cadena;
	}
	public static void main(String[] args) {
		//objetos y variables
		Scanner sc=new Scanner(System.in);
		String frase1, frase2;
		int num;

		//probando métodos estáticos
		System.out.println("Elija una opción:");
		System.out.println("1. Concatenación.");
		System.out.println("2. Conversión de cadena a array.");
		System.out.println("3. Convertir array en cadena.");
		num=sc.nextInt();
		sc.nextLine();
		switch(num){
			case 1:
				System.out.print("Primera frase: ");
				frase1=sc.nextLine().trim();
				System.out.print("Segunda frase: ");
				frase2=sc.nextLine().trim();
				System.out.print("El resultado del método concatenar es: "+concatenar(frase1,frase2));
				break;
			case 2:
				System.out.print("Introduce una cadena: ");
				frase1=sc.nextLine().trim();
				System.out.print("El resultado del método es: "+Arrays.toString(cadenaAArray(frase1)));
				break;
			case 3:
				System.out.print("Introduzca la longitud máxima de tu array: ");
				int[] numeros=new int[sc.nextInt()];
				for (int i=0; i<numeros.length; i++) {
					numeros[i]=sc.nextInt();
				}
				System.out.print("El resultado del método es \""+convierteArrayEnString(numeros)+"\"");
				break;
			default:
				System.out.print("Opción no encontrada.");
		}
	}
}