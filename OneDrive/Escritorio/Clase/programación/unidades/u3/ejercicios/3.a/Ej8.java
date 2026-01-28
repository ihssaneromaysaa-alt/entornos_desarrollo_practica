import java.util.Scanner;
public class Ej8{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int num1=0, num2=0, i=1, repuesto;
		String resultado;
		boolean encontrado=false;
		
		try{
			//Entrada de datos
			System.out.print("Primer número:");
			num1=sc.nextInt();
			System.out.print("Segundo número:");
			num2=sc.nextInt();
		}
		catch(Exception e){
			System.out.println("ERROR"+e);
		}
		
		//Problema
		if(num1<=0 || num2<=0)
			System.out.print("No tienen que ser negativos ni cero.");
		else{
			if(num1<num2)
				i=num2;
			else
				i=num1;
			while(!encontrado){
				//el bucle continúa hasta que tengamos
				//un número que sea divisble entre los dos números.
				if(i%num1==0 && i%num2==0){
					System.out.println("MCM ("+num1+","+num2+") = "+i);
					//System.out.println(i);
					encontrado=true;
				}
			i++;
			}
		}
	}
}