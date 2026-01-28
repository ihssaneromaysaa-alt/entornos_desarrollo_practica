public class ArrayMetodo{
	public static void main(String[] args) {
		int array[];
		array=ArrayConNumerosConsecutivos[2];//Tamaño 2
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);			
		}
		//toCharArray()
		//convierte el string en un array de caracteres 
		/*ciuando creamos un array
		los inicializa con null.
		una vez q ya los tengo creados para acceder a cada uno de 
		esos objetos como en los arrays*/
	}
	//Método que devuelve arrays:
	static int[] ArrayConNumerosConsecutivos (int totalNumeros) {
		int[] r=new int[totalNumeros];
		for (int i=0;i<totalNumeros;i++) r[i]=i;
		return r;
	}
}