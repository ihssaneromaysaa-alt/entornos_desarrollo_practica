/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional_switch;

/**
 *
 * @author FMA
 */
public class Condicional_switch {

   /*Vamos a realizar el cÃ¡lculo de la nota de un examen 
     * de tipo test. Para ello, tendremos en cuenta el nÃºmero
     * total de preguntas, los aciertos y los errores. Dos errores
     * anulan una respuesta correcta.
     * 
     * La nota que vamos a obtener serÃ¡ un nÃºmero entero.
     * 
     * Finalmente, se muestra por pantalla la nota obtenida, asÃ­
     * como su calificaciÃ³n no numÃ©rica. 
     * 
     * La obtenciÃ³n de la calificaciÃ³n no numÃ©rica se ha realizado
     * utilizando la estructura condicional mÃºltiple o switch. 
     * 
     */
    public static void main(String[] args) {
         // DeclaraciÃ³n e inicializaciÃ³n de variables
        int num_aciertos = 17;
        int num_errores = 3;
        int num_preguntas = 20;
        int nota = 0;
        String calificacion="";
    
        //Procesamiento de datos
        nota = ((num_aciertos - (num_errores/2))*10)/num_preguntas;
    
        switch (nota) {
            case 5: calificacion="SUFICIENTE"; 
                    break;
            case 6: calificacion="BIEN"; 
                    break;
            case 7: calificacion="NOTABLE"; 
                    break;
            case 8: calificacion="NOTABLE"; 
                    break;
            case 9: calificacion="SOBRESALIENTE"; 
                    break;
            case 10: calificacion="SOBRESALIENTE"; 
                    break;
            default: calificacion="INSUFICIENTE";            
                   
        }
        
        //Salida de informaciÃ³n
        System.out.println ("La nota obtenida es: " + nota);
        System.out.println ("y la calificaciÃ³n obtenida es: " + calificacion);
    }
    
}
