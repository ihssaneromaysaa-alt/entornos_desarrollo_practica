import java.util.Scanner;
public class EjCuatroCantidad{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int cantValores, i;
		double cantMenCeros=0, cantMayCeros=0, cantIguCeros=0;
		double num;
		
		//Datos de entrada
		System.out.print("Cantidad de valores: ");
		cantValores=sc.nextInt();
		
		//Operador (estructura de repetición)
		for(i=1; i<=cantValores; i++){
			System.out.println("Introduzca un número: ");
			num=sc.nextInt();
			if(num>0){
				cantMayCeros++;
			}
			else
				if(num<0)
					cantMenCeros++;
				else
					cantIguCeros++;
		}
		
		//Datos de salida
		System.out.println("Cantidad de valores mayores que cero: "+cantMayCeros);
		System.out.println("Cantidad de valores iguales que cero: "+cantIguCeros);
		System.out.println("Cantidad de valores menores que cero: "+cantMenCeros);
	}
}