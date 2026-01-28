import java.lang.Exception;
import java.util.Scanner;
public class Ejercicio_resuelto_excepciones1 {
    public static void main(String[] args){
        int numero=-1;
        int intentos=0;
        String linea;
        Scanner sc = new Scanner(System.in);
        do{
            try{
                System.out.print("Introduzca un número entre 0 y 100: ");
                sc.close();
				linea = sc.nextLine();
                numero = Integer.parseInt(linea);
                
            }catch(NumberFormatException e){
                System.out.println("ERROR.");
                
            }catch(Exception e){
                System.out.println("Error al leer del teclado.");
                e.printStackTrace();
				numero=2;
            }finally{
                intentos++;
            }
        }while (numero < 0 || numero > 100);
        
        System.out.println("El número introducido es: " + numero);
        System.out.println("Número de intentos: " + intentos);
          
    }
    
}
