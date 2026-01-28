import java.util.Scanner;
public class EjDosAdivinar{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		int num=0, numIntentos=0, aleatorio = (int)(Math.random()*(100-1+1)+1);
		
		//Entrada de datos
		//System.out.printf("Pista: %d\n",aleatorio);
		System.out.printf("Introduzca un número: ");
		
		while((numIntentos<10) && (num!=aleatorio)){
			num=sc.nextInt();
			if(num<aleatorio){
					System.out.print(num+" es menor que el número aleatorio.");
					System.out.print("\nIntroduzca otro número: ");
			}
			else
				if(num>aleatorio){
					System.out.print(num+" es mayor que el número aleatorio.");
					System.out.print("\nIntroduzca otro número: ");
				}
			numIntentos++;
		}
		
		//Salida de datos
		if((numIntentos<10) && (num==aleatorio)){
			System.out.print("\n"+num+" es el número aleatorio.");
			System.out.print("\nHas acertado en "+numIntentos+" intentos");
		}
		else
			if((numIntentos==10) && (num==aleatorio))
				System.out.print("\nHas acertado en el décimo intento");
			else{
				System.out.print("\nNo has acertado en 10 intentos\nsuerte en el próximo intento");
				System.out.print("\nEl número aleatorio era: "+aleatorio);
			}
	}
}