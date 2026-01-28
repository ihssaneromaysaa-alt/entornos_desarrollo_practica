import java.util.Scanner;
public class aanuevo1{
	public static void main(String[]args){
		int numero;
		Scanner sc=new Scanner(System.in);
		ArrayList numeros = new ArrayList();
		ArrayList estrellas = new ArrayList();
		// Genera 5 numeros entre 1 y 50
		for (int i = 1; i <= 5; i++) {
			numero = (int) (Math.random() * 50 + 1);
			if (numeros.contains(numero)) {
				i--;
			} else {
				numeros.add(numero);
			}
		}
		System.out.println("La convinacion del Euromillones es:");
		for (Integer n : numeros) {
			System.out.println(n + "");
		}
		// Genera 2 numeros entre 1 y 11
		for (int i = 1; i <= 2; i++) {
			numero = (int) (Math.random() * 11 + 1);
			if (estrellas.contains(numero)) {
				i--;
			} else {
				estrellas.add(numero);
			}
		}
		System.out.println("\nY las estrellas son: ");
		for (Integer n : estrellas) {
			System.out.println(n);
		}
	}
}