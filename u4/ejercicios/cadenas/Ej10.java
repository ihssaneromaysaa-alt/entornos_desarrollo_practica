import java.util.Scanner;
public class Ej10{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String cadena="Me encanta Java", cadenaInv="";
		int seleccion, contLetras=0, contPalabras=0,contA=0;
		String selectt;
		
		do{
			System.out.println("Introduzca un número");
			System.out.println("Estas son las opciones:");
			System.out.printf("\n1.Contar número de letras.\n2.Contar número de palabras\n3.Contar el número de 'a'\n4.Invertir palabras.\n5.Presentar invertida de letra a letra.\n");
			//seleccion=sc.nextInt();
			selectt=sc.nextLine();
		
		
			switch(selectt){
				case "1":
					for(int i = 0;i<cadena.length();i++)
						contLetras+=(Character.isLetter(cadena.charAt(i)))?1:0;
					System.out.print(cadena+" tiene "+contLetras+" número de letras");
					break;
				case "2":
					contPalabras=cadena.trim().split("\\s+").length;
					//cadena.split("\\s+") separa la cadena por palabras 
					//un espacio o más.
					System.out.print(cadena+" tiene "+contPalabras+" número de palabras");
					break;
				case "3":
					for(int i = 0;i<cadena.length();i++)
						contA+=(cadena.charAt(i)=='a')?1:0;
					System.out.print(cadena+" tiene "+contA+" número de a's");
					break;
				case "4":
					// Invertir palabra por palabra
					// Aún no tengo porqué saber hacer esto, no lo hemos dado
					
					String[] palabras = cadena.split("\\s+");
					StringBuilder invertida = new StringBuilder();

					for (int i = palabras.length - 1; i >= 0; i--) {
						invertida.append(palabras[i]);
						if (i > 0) invertida.append(" ");
					}

					System.out.print(invertida.toString());
					break;
				case "5":
					for(int j=(cadena.length()-1); j>-1;j--){
						cadenaInv+=cadena.charAt(j);
					}
					System.out.print("La cadena invertida letra por letra es: "+cadenaInv);
					break;
				case "s":
					System.out.print("THE END");
					break;
				default:
					System.out.print("No existe esa opción");
			}
		}while(!selectt.equals("s"));
	
	}
	
}