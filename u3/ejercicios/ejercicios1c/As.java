import java.util.Scanner;
//import java.lang.Exception; //Paquete excepciones
public class As{
	public static boolean esPrimo (int n){
		if(n==2)
			return false;
		
	}
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int repuesto,num=1,i,j,contador=0;
		String resultado="";
		
		//Entrada
		System.out.print("\nNúmero de primos: ");
		j=sc.nextInt();
		repuesto=(int)Math.sqrt(num);
		while(contador<j){
			//Salida
			if(esPrimo(num)){
				System.out.print(num+" es primo.");
			}
			contador++;
		}
	}
}
//aritméticos
//salir del tamaño de un tipo de dato
//no such elemten exception
//null pointer
//illegal, de string a número