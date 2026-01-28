import java.util.Scanner;
public class Ej11{
	public static void main(String[]args){
		
		//Objetos y variables 
		Scanner sc = new Scanner(System.in);
		String cadena, cadenaUni="U+";
		char carac;
		int num, contVoc=0, contCons=0, contAlf=0, i=0;
		
		//Entrada
		System.out.print("Introduzca una cadena de texto: ");
		cadena=sc.nextLine();
		
		//Salida
		while(i<cadena.length()){
			cadena=cadena.toUpperCase();
			carac=cadena.charAt(i);
			//num=carac.getNumericValue();
			if(carac=='A' || carac=='E' ||carac=='I' || carac=='O' || carac=='U'){
				contVoc++;
			}
			else if(Character.isLetter(carac))
				contCons++;
			else if(Character.isLetterOrDigit(carac))
				contAlf++;
			i++;
		}
		contAlf+=contCons+contVoc;
		System.out.println("Número de carácteres alfanuméricos: "+contAlf);
		System.out.println("Número de vocales: "+contVoc);
		System.out.println("Número de consonante: "+contCons);
	}
}