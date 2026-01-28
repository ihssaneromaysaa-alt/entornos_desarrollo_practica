import java.util.Scanner;
public class Ej9_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		String abecedario="abcdefghijklmnñopqrstuvwxyz";
		char[] letras=abecedario.toCharArray();
		int[] contador= new int[27];
		int i, pos;

		System.out.print("Introduzca una frase: ");
		frase=sc.nextLine();

		for (i=0; i<frase.length(); i++) {
			pos=0;
			for (char letra : letras) {
				if(frase.charAt(i)==letra)
					contador[pos]++;
				pos++;
			}
		}

		i=0;
		for (int numero : contador) {
			System.out.print("\nLa letra "+letras[i]+" se ha introducido "+numero);
			i++;
			
		}
	}
}