import java.util.Scanner;
public class a{
	public static void main(String[]args){
		
		//variables
		int x;
		Scanner sc = new Scanner(System.in);
		
		//salida
		System.out.println("Help, dime un número de 3 cifras para invertirlo ");
		
		//por ejemplo 234.
		
		//entrada
		x=sc.nextInt();
		
		//separar cifras
        int c = x / 100; //234 entre 100=2
        int d = (x / 10) % 10; //234 entre 10=23'4, 23 entre 10=2'3, el resto es 3
        int u = x % 10; //234 entre 10=23'4, el resto es 4
		
		//invertir número
        int invertido = (u * 100) + (d * 10) + c; //400+30+2

        //mostrar resultado
        System.out.println("Tu número invertido es: " + invertido);
		}
	}