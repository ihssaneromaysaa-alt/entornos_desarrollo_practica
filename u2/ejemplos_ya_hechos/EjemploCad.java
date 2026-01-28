public class EjemploCad{
	public static void main (String[]args){
		String cad1="CICLO DAW";
		String cad2="ciclo daw";
		double n=25;
		String dni="78432799K";
		
		System.out.println("La cadena 1 es: "+cad1);
		System.out.println("Esta cadena en minúscula es: "+cad1.toLowerCase());
		
		System.out.println("La cadena 2 es: "+cad2);
		System.out.println("Esta cadena en mayúscula es: "+cad1.toUpperCase());
		
		System.out.println("Concatenación "+cad1+" y "+cad2+" es "+cad1.concat(cad2));
		
		System.out.println("cad.1substring(0,5) es "+cad1.substring(0,5));
		
		//Convertir un valor numérico en cadena:
		System.out.println("Cadena correspondiente al valor numérico "+String.valueOf(n));
		
		System.out.println(dni.substring(8,9));
		System.out.println(dni.chartAt(5));
		
	}
}