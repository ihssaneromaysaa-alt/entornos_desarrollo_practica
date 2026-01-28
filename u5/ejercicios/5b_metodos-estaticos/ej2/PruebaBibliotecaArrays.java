import java.util.Arrays;
import java.util.Scanner;
public class PruebaBibliotecaArrays{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			//los scanners son distintos se tienen q poner en todos
			//los métodos;

			int opcion;
			do{
				System.out.println("\n1. generaArrayInt");
				System.out.println("2. minimoArrayInt");
				System.out.println("3. maximoArrayInt");
				System.out.println("4. mediaArrayInt");
				System.out.println("5. estaEnArrayInt");
				System.out.println("6. posicionEnArray");
				System.out.println("7. volteaArrayInt");
				System.out.println("8. rotaDerechaArrayInt");
				System.out.println("9. rotaIzquierdaArrayInt");
				System.out.print("Eliga una opción: ");
				opcion=sc.nextInt();
				ejecutarEjercicio(opcion);
			}while(opcion>0 && opcion<=9);
		}	
	public static void ejecutarEjercicio(int n){
		Scanner sc=new Scanner(System.in);
		int longitud, max, min, num, nIzq, nDer;
		int[] miArray=BibliotecaArrays.generarArrayInt(9,9,0);
		switch(n){
			case 1://generar array
				System.out.print("Introduzca la longitud del nuevo array: ");
				longitud=sc.nextInt();
				System.out.print("Introduzca el máximo número random: ");
				max=sc.nextInt();
				System.out.print("Introduzca el mínimo número random: ");
				min=sc.nextInt();
				miArray=BibliotecaArrays.generarArrayInt(longitud,max,min);
				System.out.println(Arrays.toString(miArray));
				break;
			case 2://encontrar el mínimo del array
				System.out.println(Arrays.toString(miArray));
				System.out.print("El número mínimo del array es "+BibliotecaArrays.minimoArrayInt(miArray));
				break;
			case 3://encontrar el máximo del array
				System.out.println(Arrays.toString(miArray));
				System.out.print("El número máximo del array es "+BibliotecaArrays.minimoArrayInt(miArray));
				break;
			case 4://sacar media
				System.out.println(Arrays.toString(miArray));
				System.out.print("La media del array es "+BibliotecaArrays.mediaArrayInt(miArray));
				break;
			case 5://encontrar en el array
				System.out.println(Arrays.toString(miArray));
				System.out.print("Introduzca un número para buscarlo en el array");
				num=sc.nextInt();
				System.out.println("El número "+num+" se encuentra en el array: "+BibliotecaArrays.estaEnArrayInt(num, miArray));
				break;
			case 6:
				System.out.println(Arrays.toString(miArray));
				System.out.println("El array volteado es el siguiente "+BibliotecaArrays.voltearArrayInt(miArray));
				break;
			case 7:
				System.out.println(Arrays.toString(miArray));
				System.out.println("n posiciones a la izq: ");
				
				break;
			default:
				System.out.println("ERROR: Opción no encontrada.");
		}
	}
}