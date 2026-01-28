import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ej7{
	public static void main(String[] args) {
		
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String fecha="";
		String day, year, month;
		//
		//.* cualquier cosa antes o despues
		//\| el carácter
		//exactamente 3 veces
		//

		System.out.println("Fecha (formato: dd|mm|aaaa): ");
		fecha=sc.nextLine().trim();
		Pattern p=Pattern.compile("^[0-9]{2}\|{1}[0-9]{2}\|{1}[0-9]{4}$");
		Matcher m=p.matcher(fecha);
		if(m.matches()){
			System.out.println("Fecha validada");
		}
		else
			System.out.println("Fecha no validada");
	}
}