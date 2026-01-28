import java.util.Scanner;
public class Ej4{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int num=0;
		
		try{
			//Entrada
			System.out.print("Número: ");
			num=Integer.parseInt(sc.nextLine());
		}
		catch(NumberFormatException e){
			System.out.print("ERROR");
		}
		catch(Exception e){
			System.out.print("ERROR");
		}
		finally{
			//Operaciones
			/*Si yo tengo 1001 le resto 1000
			si yo tengo 1000 le resto 10^3=1000 *10
			*/
			num=Math.abs(num%10);
			//Si es negativo cambia el signo, lo divide 
			//entre 10 y coge el resto
			System.out.print(num);
		}
	}
}