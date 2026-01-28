import java.util.Scanner;
public class EjDoceFecha{/*
	public enum Month{Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio,
	Agosto, Septiembre, Octubre, Noviembre, Diciembre}*/
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc = new Scanner(System.in);
		int day,mesNum,year;
		
	
		//Entrada de datos
		System.out.print("Día: ");
		day=sc.nextInt();
		System.out.print("Mes: ");
		mesNum=sc.nextInt();
		/*Month mes1=Month.values()[mesNum-1];*/
		System.out.print("Año: ");
		year=sc.nextInt();
		
		//Salida de datos
		if(((mesNum<=12 && mesNum>=1) && (day>0 && day<=31)))
			System.out.print("Correcto "+"("+day+"/"+mesNum+"/"+year+")");
		else
			System.out.print("Incorrecto, revise los datos.");
	}
}