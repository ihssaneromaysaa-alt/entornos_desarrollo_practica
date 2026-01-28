import java.util.Scanner;
import java.lang.Exception;
public class Prueba{
	public static void main(String[]args){
	
		int a,b;
		Scanner sc= new Scanner(System.in);
		
	
		System.out.print("a=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
		
		try{
			System.out.print("a/b="+(a/b));
		}
		catch(ArithmeticException e){
			System.out.print("No se puede dividir entre 0");
		}
		//catch(e){}
		finally{}
	}
}