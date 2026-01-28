import java.util.Scanner; //Importe del paquete con la clase Scanner
//A=πr^2
public class EjOchoRadio{
	public static void main (String[]args){
		
		//Variables y objetos
		Scanner sc = new Scanner (System.in);
		double radio, a;
		
		System.out.println("Introduce el radio");
		radio=sc.nextDouble();
		
		//Fórmula de área
		a=Math.PI*Math.pow(radio,2);
		
		System.out.printf("El área es %.3f",a);
	}
}