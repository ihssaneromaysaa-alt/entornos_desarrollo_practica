import java.util.Scanner;
public class Ej7{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc = new Scanner (System.in);
		double alt=0,anch=0;
		double total=0;
		char escudo='n';
		
		try{
			//Entrada
			//sc.close()
			System.out.print("Introduzca la altura de la bandera en cm: ");
			alt=sc.nextDouble();
			System.out.print("Ahora introduzca la anchura: ");
			anch=sc.nextDouble();
			sc.nextLine();
			System.out.print("¿Quiere escudo bordado? (s/n): ");
			escudo=sc.nextLine().charAt(0);
		}
		catch(IllegalStateException e){
			System.out.println("Error del Scanner.");
		}
		catch(Exception e){
			System.out.println("ERROR");
		}
		finally{
			//Salida de datos
			System.out.println("\n\nGracias. Aquí tiene el desglose de su compra. ");
			total=(alt*anch)/100.0;
			System.out.printf("•Bandera de %.1f cm^2: %.2f €\n",alt*anch,total);
			total += (escudo == 's') ? 2.5 : 0.0;
			System.out.println("•Gastos de envio: 3,25€");
			total+=3.25;
			System.out.println("•Total: "+total);
		}
	}
}