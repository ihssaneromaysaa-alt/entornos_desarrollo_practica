import java.util.Scanner;
public class EjSietePotencia{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		int base, exponente;
		
		//Entrada
		System.out.println("Por favor introduzca una base");
		base=sc.nextInt();
		System.out.println("Por favor introduzca el exponente");
		exponente=sc.nextInt();
		
		//Salida
		if(exponente==0){
			System.out.println(base+"^"+exponente+" = "+Math.pow(base,exponente));
		}
		else{
			if(exponente>0)
				System.out.println(base+"^"+exponente+" = "+Math.pow(base,exponente));
			else
				System.out.println(base+"^"+exponente+" = "+Math.pow(base,(-1/exponente)));
		}
		
		System.out.println("Fin del programa");
	}
}