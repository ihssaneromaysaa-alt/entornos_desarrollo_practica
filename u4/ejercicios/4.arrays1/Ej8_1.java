import java.util.Scanner;

public class Ej8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temp = new double[12];
        int offset = 20; // posición del cero en el gráfico

        // Pedir temperaturas
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Introduzca la temperatura del mes " + (i + 1) + ": ");
            temp[i] = sc.nextDouble();
        }

        System.out.println("\nDiagrama de temperaturas:");
        
        // Dibujar diagrama
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Mes " + (i + 1) + ": ");
            
            int spaces = offset; // posición inicial del cero
            if (temp[i] < 0) {
                // Espacios para valores negativos
                for (int s = 0; s < offset + (int)temp[i]; s++) System.out.print(" ");
                // Dibujar barras negativas hacia la izquierda
                for (int b = 0; b < Math.abs((int)temp[i]); b++) System.out.print("^");
                System.out.println("|"); // marcar el cero
            } else {
                // Espacios hasta el cero
                for (int s = 0; s < offset; s++) System.out.print(" ");
                System.out.print("|"); // marcar el cero
                // Dibujar barras positivas
                for (int b = 0; b < (int)temp[i]; b++) System.out.print("*");
                System.out.println();
            }
        }
    }
}
