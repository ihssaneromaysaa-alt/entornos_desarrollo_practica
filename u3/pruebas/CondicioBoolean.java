import java.util.Scanner; //Importe del paquete con la clase Scanner

public class CondicioBoolean{
	public static void main(String[]args){
		int nota;
		Scanner sc=new Scanner(System.in);
		System.out.println("Indica una nota");
		nota=sc.nextInt();
		String cal=(nota<5)?"Has suspendido":"Has aprobado";
		System.out.println(cal);
	}
}