public class Dias{
	public static void main (String[]args){
			
			//Variable enumerada.
			
			enum Dias (lunes, martes, miercoles, jueves, viernes, sabado, domingo);
			
			Dias diasactual=Dias.viernes;
			
			System.out.println("hoy es "+diasactual);
			}
		}