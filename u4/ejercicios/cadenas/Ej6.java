import java.util.Scanner;
public class Ej6{
	public static void main(String[] args) {
		
		//Objetos y variables
		Scanner sc= new Scanner(System.in);
		String cad1,cad2;

		System.out.print("Cadena 1: ");
		cad1=sc.nextLine();
		System.out.print("Cadena 2: ");
		cad2=sc.nextLine();

		if(cad1.contains(cad2))
			System.out.print(cad1+" contiene "+cad2+"\nEn la posición: "+cad1.indexOf(cad2));
		else
			System.out.print(cad1+" no contiene "+cad2);
	}
}