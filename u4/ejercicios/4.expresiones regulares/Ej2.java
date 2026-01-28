import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Repasar

public class Ej2{
	public static void main(String[] args) {
		
		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		String nie, letras="TRWAGMYFPDXBNJZSQVHLCKE";
		String numConvertido;
		int num;
		char inicial;
		boolean dniValido=false;

		// Regex NIE: X/Y/Z + 7 dígitos + 1 letra
		//pedimos nie
		System.out.print("Introduzca el NIE: ");
		nie=sc.nextLine().trim().toUpperCase();
		//Y1234567X

		//convertimos el primer carácter
		inicial=nie.charAt(0);
		numConvertido= switch(inicial){
			case 'X'->"0";
			case 'Y'->"1";
			default->"2";
		};

		
		//contatenamos con los demás números
		numConvertido+=nie.substring(1,8);

		num=Integer.parseInt(numConvertido);

		System.out.println("Analizando NIE: [" + nie + "]");
		System.out.println("numConvertido = " + numConvertido);


		if(letras.charAt(num%23)!=nie.charAt(8)){
			System.out.println("Letra no coincide");
		}
		
		Pattern p= Pattern.compile("^[XYZ][0-9]{7}[A-Z]$");
		Matcher m= p.matcher(nie);

		if(m.matches() && letras.charAt(num%23)==nie.charAt(8)){
			System.out.println("Coincide");
			dniValido=true;
		}
		else{
			System.out.println("No coincide");
			System.out.println("Letra correcta: "+letras.charAt(num%23));
		}
	}
}