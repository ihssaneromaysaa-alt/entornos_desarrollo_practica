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
				System.out.print("Elija una opción: ");
				opcion=sc.nextInt();
				if(opcion!=0)
					ejecutarEjercicio(opcion);
				else
					System.out.println("Que tenga un buen día.");
			}while(opcion>0 && opcion<=9);
		}	
	public static void ejecutarEjercicio(int n){
		Scanner sc=new Scanner(System.in);
		int longitud, max, min, num, nIzq, nDer;
		int[] miArray=BibliotecaArrays.generarArrayInt(9,0,20);
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
				System.out.print("El número máximo del array es "+BibliotecaArrays.maximoArrayInt(miArray));
				break;
			case 4://sacar media
				System.out.println(Arrays.toString(miArray));
				System.out.printf("La media del array es %.2f",BibliotecaArrays.mediaArrayInt(miArray));
				break;
			case 5://boolean sacar si está en el array o no
				System.out.println(Arrays.toString(miArray));
				System.out.print("Introduzca un número para buscarlo en el array: ");
				num=sc.nextInt();
				System.out.println("El número "+num+" se encuentra en el array: "+BibliotecaArrays.estaEnArrayInt(num, miArray));
				break;
			case 6://posición en array
				System.out.println(Arrays.toString(miArray));
				System.out.print("Introduzca un número pasa sacar su posición: ");
				num=sc.nextInt();
				System.out.println("El número "+num+" se encuentra en el array: "+BibliotecaArrays.posicionEnArray(miArray, num));
				break;
			case 7://voltearArray
				System.out.println(Arrays.toString(miArray));
				System.out.println("El array volteado es el siguiente "+Arrays.toString(BibliotecaArrays.voltearArrayInt(miArray)));
				break;
			case 8://rotaDerechaArrayInt
				System.out.println(Arrays.toString(miArray));
				System.out.print("n posiciones a la der: ");
				num=sc.nextInt();
				System.out.println("Array rotado "+num+" veces a la derecha: "+Arrays.toString(BibliotecaArrays.rotarDerechaArrayInt(miArray,num)));
				break;
			case 9://rotaIzquierdaArrayInt
				System.out.println(Arrays.toString(miArray));
				System.out.print("n posiciones a la izq: ");
				num=sc.nextInt();
				System.out.println("Array rotado "+num+" veces a la izquierda: "+Arrays.toString(BibliotecaArrays.rotarIzquierdaArrayInt(miArray,num)));
				break;
			default:
				System.out.println("ERROR: Opción no encontrada.");
		}
	}
}