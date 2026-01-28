/**
 *
 * @author FMA
 */
public class SentenciasCondicionales {
    public static void main(String[] args) {
         // Declaración e inicialización de variables
        int numAciertos = 12;
        int numErrores = 3;
        int numPreguntas = 20;
        double nota = 0;
        String calificacion="";
    
        //Procesamiento de datos
        nota =((numAciertos - (numErrores/2.0f))*10)/numPreguntas;
        if (nota < 5)
        {
           calificacion="INSUFICIENTE";
        }
        else
        {
            if (nota >= 5 && nota <6)
               calificacion="SUFICIENTE";       
            else{
				if (nota >= 6 && nota <7)
					calificacion="BIEN"; 
				else{ 
					if (nota >= 7 && nota <9) 
				   calificacion="NOTABLE";
					else
						calificacion="SOBRESALIENTE";
				}
			}
		}
        
        //Salida de información
        System.out.println ("La nota obtenida es: " + nota);
        System.out.println ("y la calificación obtenida es: " + calificacion);
    }
    
}
