import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String email;
        
        do {
            System.out.print("Email (s para salir): ");
            email = sc.nextLine().trim().toLowerCase();
            
            // Si es "s" simplemente termina el ciclo en la condición del while
            // No usamos break ni continue
            
            if (!email.equals("s")) {
                // Patrón único para todo el email
                Pattern p = Pattern.compile(
                    "^(?![._-])[a-z0-9._-]*[a-z0-9](?<!\\.)" +   // parte antes del @
                    "@" +
                    "(?!-)[a-z0-9-]+(?:\\.[a-z0-9-]+)*\\.[a-z]{2,3}$"
                );
                
                Matcher m = p.matcher(email);
                
                if (m.matches()) {
                    System.out.println("Email válido");
                } else {
                    System.out.println("Email no válido");
                }
            }
            
        } while (!email.equals("s"));
        
        System.out.println("Fin del programa.");
        System.out.println("Que pase un buen día");
        
        sc.close();
    }
}