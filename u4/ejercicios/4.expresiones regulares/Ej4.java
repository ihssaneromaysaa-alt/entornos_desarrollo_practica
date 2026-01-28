import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Repasar

public class Ej4{
	public static void main(String[] args) {
		
		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		String nie, letras="TRWAGMYFPDXBNJZSQVHLCKE";
		String numConvertido="";
		int num;
		char inicial;
		boolean nieValido=false;

		do{
			numConvertido="";
			// Regex NIE: X/Y/Z + 7 dígitos + 1 letra
			//pedimos nie
			System.out.print("Introduzca el NIE: ");
			nie=sc.nextLine().trim().toUpperCase();
			//Y1234567X

			Pattern p= Pattern.compile("^[XYZ][0-9]{7}[A-Z]$");
			Matcher m= p.matcher(nie);

			if(m.matches()){
				
				//convertimos el primer carácter
				inicial=nie.charAt(0);
				/*numConvertido= switch(inicial){
					case 'X'->"0";
					case 'Y'->"1";
					default->"2";
				};*/
				switch(inicial){
					case 'X': numConvertido+="0";
						break;
					case 'Y': numConvertido+="1";
						break;
					case 'Z':numConvertido+="2"; 
						break;
				};
				//contatenamos con los demás números
				numConvertido+=nie.substring(1,8);
				num=Integer.parseInt(numConvertido);

				System.out.println("Analizando NIE: [" + nie + "]");
				System.out.println("numConvertido = " + numConvertido);

				if(letras.charAt(num%23)==nie.charAt(8)){
					System.out.println("Coincide");
					nieValido=true;
				}
				else{
					System.out.println("No coincide");
					System.out.println("Letra correcta: "+letras.charAt(num%23));
				}
			}
			else
				System.out.println("ERROR: patrón nie incorrecto.");
		}while(!nieValido);
	}
}