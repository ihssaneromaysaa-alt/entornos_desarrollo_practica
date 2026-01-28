import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Ej3{
	public static void main(String[]args){

		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		String dni, letras="TRWAGMYFPDXBNJZSQVHLCKE";
		int num;
		char letra;
		boolean dniValido=false;

		do{
			System.out.print("Introduzca el DNI: ");
			dni=sc.nextLine();
			num=Integer.parseInt(dni.substring(0,8));
			letra=dni.toUpperCase().charAt(8);

			if(letras.charAt(num%23)!=letra){
				System.out.println("Letra no coincide");
			}

			Pattern p= Pattern.compile("^[0-9]{8}[A-Z]$");
			Matcher m= p.matcher(dni);

			if(m.matches()==letra){
				System.out.println("Coincide");
				dniValido=true;
			}
			else{
				System.out.println("No coincide con el patrón");
				System.out.println("Letra correcta: "+letras.charAt(num%23));
			}

		}while(!dniValido);
	}
}