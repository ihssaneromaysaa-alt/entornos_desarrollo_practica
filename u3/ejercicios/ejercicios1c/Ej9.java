public class Ej9{
	public static void tablaMult(int num1){
		int i;
		for(i=0;i<=10;i++){
			//Salida de datos con la tabla de multiplicar.
			System.out.println(num1+"*"+i+" = "+i*num1);
		}
	}
	public static void main(String[]args){
	
		//Objetos y variables
		int i;
		
		//Salida
		for(i=1;i<=5;i++)
			tablaMult(i);
	}
}