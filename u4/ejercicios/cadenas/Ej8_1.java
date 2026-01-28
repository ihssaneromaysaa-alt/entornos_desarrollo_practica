import java.util.Scanner;
public class Ej8_1{
	public static void main(String[]args){
		
		//Objetos y variables 
		Scanner sc = new Scanner(System.in);
		char carac;
		int contVoc=0, contCons=0, contAlf=0, i=0;
		String cadena, vocales="AEIOU",consonantes="BCDFGHJKLMNÑPQRSTVWXYZ";
		
		//Entrada
		System.out.print("Introduzca una cadena de texto: ");
		cadena=sc.nextLine().toUpperCase();
		
		for (; i < cadena.length(); i++) {
            carac = cadena.charAt(i);
            if (vocales.indexOf(carac) >= 0)
                contVoc++;
            else if (consonantes.indexOf(carac) >= 0) 
                contCons++;
            else
                contAlf++;
		}
		//contAlf+=contVoc+contCons;
		//Salida
		System.out.println("Número de carácteres alfanuméricos: "+contAlf);
		System.out.println("Número de vocales: "+contVoc);
		System.out.println("Número de consonante: "+contCons);
	}
}