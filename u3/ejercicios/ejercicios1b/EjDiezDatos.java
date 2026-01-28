import java.util.Scanner;
public class EjDiezDatos{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		double a,b,c;
	
		//Entrada de datos
		System.out.println("Introduzca el primer lado del triángulo");
		a=sc.nextDouble();
		System.out.println("Introduzca el segundo lado del triángulo");
		b=sc.nextDouble();
		System.out.println("Introduzca el tercero lado del triángulo");
		c=sc.nextDouble();
		
		//Salida de datos
		if(Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2) 
		|| Math.pow(b,2)==Math.pow(a,2)+Math.pow(c,2)
		|| Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2)){
			System.out.println("Es un triángulo rectangulo");
		}
		else
			if(a==b || c==a || b==c)
				System.out.println("El triángulo es isósceles");
			else
				System.out.println("El triángulo es escaleno");
	}
}