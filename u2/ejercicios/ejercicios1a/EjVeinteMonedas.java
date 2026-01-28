import java.util.Scanner; //Importe paquete con la clase Scanner
public class EjVeinteMonedas{
	public static void main(String[]args){
		
		//variables y objetos
		double dos,uno,cincuenta,veinte,diez,total;
		Scanner sc = new Scanner(System.in);
		
		//salida
		System.out.println("Introduce el número de monedas que tienes de cada tipo para calcular el total:");
		System.out.print("Monedas de dos euros:");
		dos=sc.nextInt();
		System.out.print("Monedas de un euro:");
		uno=sc.nextInt();
		System.out.print("Monedas de cincuenta céntimos:");
		cincuenta=sc.nextInt();
		System.out.print("Monedas de veinte céntimos:");
		veinte=sc.nextInt();
		System.out.print("Monedas de diez céntimos:");
		diez=sc.nextInt();
		
		if(dos<uno){
			System.out.print(uno+" es mayor que "+dos);
		}
		else{
			System.out.print(dos+" es mayor o igual que "+uno);
		}
		
		//resolver el problema
		
		int numero = (int)(Math.random()*(6-1+1)+1); 
		//Dado del 1 al 6
		System.out.println(numero);
		
		total=2*dos+uno+0.5*cincuenta+0.2*veinte+0.1*diez;
		
		System.out.println("Tu total son "+total+" euros");
		}
	}