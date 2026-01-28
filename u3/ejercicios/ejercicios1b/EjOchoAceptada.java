import java.util.Scanner;
public class EjOchoAceptada{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		int nota, edad;
		char sexo;
		
		//Entrada
		System.out.print("Nota: ");
		nota=sc.nextInt();
		System.out.print("Edad: ");
		edad=sc.nextInt();
		sc.nextLine();
		System.out.print("Sexo: ");
		sexo=sc.nextLine().charAt(0);
		
		
		//Salida
		if(nota>=5&&edad>=18){	
			if(sexo=='F')
				System.out.print("ACEPTADA");
			else{
				if(sexo=='M')
				System.out.print("POSIBLE");
			}
		}
		else
			System.out.print("NO ACEPTADO");
	}
}