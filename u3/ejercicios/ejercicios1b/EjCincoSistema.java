import java.util.Scanner;
public class EjCincoSistema{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		String nombre="",contr="";
		
		//Entrada
		System.out.print("Introduzca nombre: ");
		nombre=sc.nextLine();
		System.out.print("Introduzca contraseña: ");
		contr=sc.nextLine();
		
		//Salida
		if(nombre.equals("pepe") && contr.equals("asdasd")){	
			//Los strings se comparan con String.equals()
			System.out.print("Has entrado al sistema");
		}
		else{
			System.out.println("Error");
		}
	}
}