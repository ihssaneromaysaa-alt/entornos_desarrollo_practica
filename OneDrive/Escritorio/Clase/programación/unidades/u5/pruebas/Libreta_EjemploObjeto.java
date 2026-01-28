import java.util.Arrays;
public class Libreta_EjemploObjeto{
	String colorExterior;
	int gramos;
	String marca;
	//altura y anchura
	double[] dimensiones= new double[2];
	int numPaginas;
	public static void main(String[] args) {
		Libreta_EjemploObjeto libreta1=new Libreta_EjemploObjeto();
		libreta1.colorExterior = "negro";
		libreta1.gramos=160;
		libreta1.marca = "Moleskine";
		libreta1.dimensiones[0] =13;//cm
		libreta1.dimensiones[1] =21; 
		libreta1.numPaginas = 104;
		
		System.out.printf("\n\n\tcolor del exterior: %s\n\n\tgramaje: %d\n\n\tmarca: %s\n\n\tdimensiones: %s\n\n\tnúmero de páginas: %d\n\n",libreta1.colorExterior,libreta1.gramos,libreta1.marca,Arrays.toString(libreta1.dimensiones),libreta1.numPaginas);
	}

}