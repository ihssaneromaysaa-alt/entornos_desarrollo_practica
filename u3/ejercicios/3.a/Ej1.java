import java.util.Scanner;
public class Ej1{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int num=0;
		
		try{	
			System.out.print("Número: ");
			num=Integer.parseInt(sc.nextLine());
		}
		catch(NumberFormatException e1){
			System.out.println("ERROR");
			System.out.println(e1);
		}
		catch(Exception e2)
			System.out.println("ERROR");
		finally{
			switch(num){
				case 1:System.out.print("El número es UNO");
					break;
				case 2:System.out.print("El número es DOS");
					break;
				case 3:System.out.print("El número es TRES");
					break;
				default:System.out.print("Número no válido");
			}
		}
	}
}