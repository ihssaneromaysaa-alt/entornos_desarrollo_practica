import java.util.Scanner;

public class Ej7_1 {
    enum Mes {
        Ene, Feb, Mar, Abr, May, Jun,
        Jul, Agos, Sept, Oct, Nov, Dic
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[12];
        Mes[] meses = Mes.values();
        int barras, i, j, gradosPorAsterisco;
        double temp;

        // Pedir las temperaturas
        for (i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura media de " + meses[i] + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        System.out.println("\n=== Diagrama de temperaturas medias ===\n");

        // Cada asterisco representa 2 grados (puedes cambiarlo)
        gradosPorAsterisco = 2;

        // Dibujar el diagrama
        for (i = 0; i < temperaturas.length; i++) {
            temp = temperaturas[i];
            barras = (int)Math.abs(temp)/gradosPorAsterisco;  // cuántos * poner

            // Nombre del mes alineado
            System.out.printf("%-12s", meses[i] + ":");

            // Si es negativa: barra a la izquierda
            if (temp < 0) {
                for (j = 0; j < barras; j++) {
                    System.out.print("*");
                }
                System.out.print("|");
            }
            // Si es cero
            else if (temp == 0) {
                System.out.print("    ");
            }
            // Si es positiva: barra a la derecha
            else {
                System.out.print("   |");
                for (j = 0; j < barras; j++) {
                    System.out.print("*");
                }
            }

            // Mostrar el valor real
            System.out.println("  " + temp + "ºC");
        }

        System.out.println("\nNota: cada * representa " + gradosPorAsterisco + " grados");
        sc.close();
    }
}