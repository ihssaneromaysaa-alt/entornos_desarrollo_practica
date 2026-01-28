import java.util.Scanner;
public class Ej7{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String cad1, cadCompleta="";
		char primera, a, c;
		boolean mayus=false; //variable bandera
		
		System.out.print("Cadena:");
		cad1=sc.nextLine();
		
		cad1=cad1.trim().toLowerCase();
		//Limpiamos la cadena y a minúsculas
		
		primera=cad1.charAt(0);
		primera=Character.toUpperCase(primera);
		
		cadCompleta+=primera;
		for(int i=1;i<cad1.length();i++){
			c=cad1.charAt(i);
			if(c==' '){
				cadCompleta+=c;
				mayus=true;
				//Si es espacio, entonces la siguiente es mayúscula
			}
			else if(mayus){
				cadCompleta+=Character.toUpperCase(c);
				mayus=false;
				//Se convierte a mayúscula
			}
			else
				cadCompleta+=c;
				//Si es una letra normal, se sigue la cadena.
		}
		System.out.print(cadCompleta);
	}
}