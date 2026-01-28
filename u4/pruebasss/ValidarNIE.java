import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarNIE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Expresión regular: primera letra X/Y/Z, seguido de 7 dígitos y una letra final
        Pattern patronNIE = Pattern.compile("^[XYZ][0-9]{7}[A-Z]$");

        // Tabla de control
        char[] tablaControl = {
            'T','R','W','A','G','M','Y','F','P','D','X','B','N',
            'J','Z','S','Q','V','H','L','C','K','E'
        };

        while (true) {
            System.out.print("Introduce un NIE: ");
            String nie = sc.nextLine().toUpperCase();

            Matcher m = patronNIE.matcher(nie);

            if (!m.matches()) {
                System.out.println("Formato incorrecto. Ejemplo válido: X1234567L");
                continue;
            }

            // Convertir primera letra a número
            char primeraLetra = nie.charAt(0);
            String numeroConvertido;

            switch (primeraLetra) {
                case 'X': numeroConvertido = "0"; break;
                case 'Y': numeroConvertido = "1"; break;
                case 'Z': numeroConvertido = "2"; break;
                default: numeroConvertido = ""; // No debería suceder por el patrón
            }

            // Obtener los 7 dígitos intermedios
            String digitos = nie.substring(1, 8);

            // Letra final introducida
            char letraFinal = nie.charAt(8);

            // Calcular control
            int numero = Integer.parseInt(numeroConvertido + digitos);
            char letraCorrecta = tablaControl[numero % 23];

            if (letraFinal == letraCorrecta) {
                System.out.println("✔ NIE válido. Letra de control correcta.");
                break; // salir del programa
            } else {
                System.out.println("❌ Letra de control incorrecta. La correcta es: " + letraCorrecta);
            }
        }

        sc.close();
    }
}
