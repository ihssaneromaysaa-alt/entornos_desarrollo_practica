/*Escribe un programa que diga si un número introducido por 
teclado es o no primo. Un número primo es aquel que sólo es
divisible entre él mismo y la unidad. Nota: Es suficiente
probar hasta la raíz cuadrada del número para ver si es divisible
por algún otro número*/
import java.util.Scanner;
public class Ej10_1{
	public static boolean esPrimo(int n, int j){
		if((n%j==0)||(n==2)) return true;
	}
	
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int repuesto,num,i;
		String resultado="";
		
		do{
			//Entrada
			System.out.print("\nNúmero (pulse 0 para salir): ");
			num=sc.nextInt();
			//Termina con la raíz cuadrada
			repuesto=(int)Math.sqrt(num);
			
			//Salida
			if(num==0){
				System.out.print("Fin del programa");
			}
			else
				if(num>1){
					for(i=2;i<=repuesto;i++){
						resultado=(esPrimo(num,i))?"No es primo":"Es primo";
						if(resultado=="No es primo")
							i=repuesto;//En cuanto no sea primo, el bucle acaba.
					}
				System.out.println(resultado);
				}
				else
					System.out.print("El número tiene que ser mayor que 1");
		}
		while(num!=0);
	}
}

//Si num=2; repuesto raiz de dos (double)=1
//Prueba cada número hasta la raíz cuadrada de num1
/*if(num%i==0){
	//System.out.print("NO ES PRIMO");
	res=false;
	i=repuesto;
}
else{
	res=true;
	i=repuesto;
}*/
//2%1==0?;
//System.out.println(resultado);
//i=repuesto;
//resultado=(res)?"Es primo":"No es primo";
//System.out.println(resultado);