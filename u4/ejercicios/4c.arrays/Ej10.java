/*Define un array de 10 datos String. Introduce los datos por teclado y une los 10 String en una sola
cadena.*/
import java.util.Scanner;
public class Ej10{
	public static void main(String[] args) {
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String[] frases=new String[10];
		int i=0;
		String frase="";
		//Entrada
		for(i=0;i<frases.length;i++){
			System.out.println((i+1)+". Introduce alguna frase");
			frases[i]=sc.nextLine();
			frase+=frases[i];
		}

		//Salida
		System.out.println(frase);
	}
}