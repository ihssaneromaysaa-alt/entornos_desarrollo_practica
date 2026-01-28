import java.util.Scanner;
public class EjCincoImprimir{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		char letra='a';
		
		while(letra!=' '){
			//Datos de entrada
			System.out.print("\nEspacio y enter para salir. ");
			System.out.print("\nIntroduzca una letra: ");
			letra=(sc.nextLine().toUpperCase()).charAt(0);
			if(letra!=' '){
				//Datos de salida
				if(letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U')
					System.out.print("VOCAL");
				else
					System.out.print("NO VOCAL");
			}
		}
		System.out.print("\nFin del programa");
	}
}