/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitiva_for;

/**
 *
 * @author FMA
 */
public class Repetitiva_for {

    public static void main(String[] args) {
        // DeclaraciÃ³n e inicializaciÃ³n de variables
        int numero = 8;
        int contador;
        int resultado=0;
        
        //Salida de informaciÃ³n
        System.out.println ("Tabla de multiplicar del " + numero);
        System.out.println (".............................. ");
        
        //Utilizamos ahora el bucle for
        for (contador=1; contador<=10;contador++)
            
        {
            resultado = contador * numero; 
            System.out.println(numero + " x " + contador + " = " + resultado);
        }
    }
}
