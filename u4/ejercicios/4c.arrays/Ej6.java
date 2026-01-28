import java.util.Scanner;
import java.util.Arrays;
public class Ej6{
	public static void main(String[] args) {
		//objetos y variables
		Scanner sc=new Scanner(System.in);
		int[] num=new int[100];
		int numero, nuevoNumero;
		int i;
		for (i=0; i<num.length; i++)
			num[i]=(int)(Math.random()*21);
		
		System.out.println("Array: "+Arrays.toString(num));
		System.out.print("Introduzca el número que quiere cambiar: ");
		numero=sc.nextInt();
		System.out.print("Introduzca el nuevo número: ");
		nuevoNumero=sc.nextInt();
		for (i=0; i<num.length; i++){
			if(num[i]==numero){
				num[i]=nuevoNumero;
				System.out.print("\""+num[i]+"\" ");
			}
			else{
				System.out.print(num[i]+" ");
			}
		}
	}
}