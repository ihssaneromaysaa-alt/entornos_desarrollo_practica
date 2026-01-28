
public class conversionTipo{
	public static void main(String[]args){
		
		//Objetos y variables.
		int a/*=12345*/;
		long b=12345;
		
		//Problema
		//Conversión automática y explícita. De int a long.
		//Conversión automática.
		a=(int)b;
		
		System.out.printf("Valor de a=%d, valor de b=%d",a,b);
		
		//No se puede convertir de long a int, ya que puede ocurrir una
		//pérdida de información.
		
		//Conversión explícita.
		
		
	}
}