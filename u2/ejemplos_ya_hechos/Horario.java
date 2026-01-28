public class Horario{
	public static void main (String[]args){
	
	//Cadena de la cabezera.
	
	String cabezera="\n\tHorario de clase daw.\n";
	cabezera+="\n\tLunes\t\tMartes\t\tMiércoles\tJueves\t\tViernes";
	cabezera+="\n\t------------\t-------\t\t---------\t------\t\t-------";
	
	//Cadena de las asignaturas.
	
	
	
	String asignaturas="\n\tProgramación\tB.datos\t\tB.datos     \tProgramación\tS.informáticos.";
	
	asignaturas+="\n\tProgramación\tB.datos\t\tB.datos     \tProgramación\tS.informáticos.";
	
	asignaturas+="\n\tS.Informáticos\tE.desarrollo\tDigitalización\tS.Informáticos\tE.desarrollo.";
	
	asignaturas+="\n\tS.Informáticos\tE.desarrollo\tProgramación\tB.datos\t\tProgramación.";
	
	asignaturas+="\n\tItinerario\tL.Marcas\tProgramación\tB.datos\t\tProgramación.";
	
	asignaturas+="\n\tItinerario\tL.Marcas\tL.Marcas\tSostenibilidad\tItinerario.";
	
	System.out.print(cabezera+asignaturas);}
	}