import java.util.Scanner; //Importe del paquete con la clase Scanner
public class EjDosPositivo{
	public static void main(String[]args){
	
	//Objetos y variables
	Scanner sc=new Scanner (System.in); //Objeto para la clase scanner
	int n1;
	
	//Entrada
	System.out.println("Introduce un número para determinar si \nes positivo o negativo");
	n1=sc.nextInt();
	if(n1==0)
		System.out.println("El número otorgado es cero");
	else{
		if(n1>0)
			System.out.println("El número otorgado es positivo.");
		else
			System.out.println("El número otorgado es negativo.");
	}
	System.out.println("Fin");	
	}
	
}