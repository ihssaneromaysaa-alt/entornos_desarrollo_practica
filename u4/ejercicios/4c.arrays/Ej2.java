import java.util.Scanner;
public class Ej2{
	public static void main(String[]args) {
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int[] num= new int[10];
		int i;
		//Estructura de control: Bucle para introducir los valores
		for(i=0;i<num.length;i++){
			System.out.println("Introduzca el número para la posición "+i);
			num[i]=sc.nextInt();
		}
		//Salida: Bucle para sacar valores
		for(i=(num.length-1);i>=0;i--){
			System.out.println(i+". "+num[i]);
		}
	}
}