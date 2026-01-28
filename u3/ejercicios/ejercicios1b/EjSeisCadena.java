import java.util.Scanner;
public class EjSeisCadena{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String cad;
		
		//Entrada
		System.out.println("Introduce una cadena ");
		cad=sc.nextLine();
		
		//Salida
		if(cad.equals(cad.toUpperCase())){
			System.out.print(cad+" está en mayúscula.");
		}
		else{
			System.out.print(cad+" está en minúscula.");
		}
	}
}