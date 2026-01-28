import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Ej9{
	public static void main(String[] args) {
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String frase, letra;
		Pattern p= Pattern.compile("[a-z]");
		int num=0, i;

		//Entrada
		System.out.println("Introduzca una frase:");
		frase=sc.nextLine().toLowerCase();
		
		//Bucle para revisar cada carácter
		for(i=0; i<frase.length(); i++){
			letra=String.valueOf(frase.charAt(i));
			Matcher m= p.matcher(letra);
			if(m.matches()){
				num++;
			}
		}
		
		//Salida
		System.out.println("El número de letras del abecedario son "+num);
	}
}