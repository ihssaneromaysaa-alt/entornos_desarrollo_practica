public class Horario1{
	public static void main (String[]args){
	
	//Cadena de la cabezera.
	
	String cabezera="\n\tIhssane Torqui. Horario de clase daw.\n";
	cabezera+="\n\tHoras/Días\tLunes\t\tMartes\t\tMiércoles\tJueves\t\tViernes";
	cabezera+="\n\t-----------\t------------\t-------\t\t---------\t------\t\t-------";
	
	//Cadena de las asignaturas.
	
	
	
	String asignaturas="\n\t08:15\t\tProgramación\tB.datos\t\tB.datos     \tProgramación\tS.informáticos.";
	
	asignaturas+="\n\t09:15\t\tProgramación\tB.datos\t\tB.datos     \tProgramación\tS.informáticos.";
	
	asignaturas+="\n\t10:15\t\tS.Informáticos\tE.desarrollo\tDigitalización\tS.Informáticos\tE.desarrollo.";
	
	asignaturas+="\n\t11:45\t\tS.Informáticos\tE.desarrollo\tProgramación\tB.datos\t\tProgramación.";
	
	asignaturas+="\n\t12:45\t\tItinerario\tL.Marcas\tProgramación\tB.datos\t\tProgramación.";
	
	asignaturas+="\n\t13:45\t\tItinerario\tL.Marcas\tL.Marcas\tSostenibilidad\tItinerario.";
	
	
	System.out.print(cabezera+asignaturas);}
	}