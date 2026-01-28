/*Utilizando un array de cadenas de caracteres para almacenar colores {rojo, amarillo, verde, blanco,
azul, negro}, implementa un programa que genera una bandera de colores aleatorios. Por ejemplo, si
el usuario quiere una bandera de dos franjas, una posible salida sería "blanco" y "rojo".
*/
import java.util.Scanner;

public class Ej11{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] colores={"rojo", "amarillo", "verde", "blanco",
		"azul", "negro"};
		int numFranjas, num, i;

		System.out.println("Introduzca el número de franjas que quieres en tu bandera");
		numFranjas=sc.nextInt();
		for(i=0;i<numFranjas;i++){
			num=(int)(Math.random()*colores.length);// da valor entre 0.0 y 5.99
			System.out.println(colores[num]);
		}
	}
}