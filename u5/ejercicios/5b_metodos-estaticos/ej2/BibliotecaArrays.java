public class BibliotecaArrays{
	public static int[] generarArrayInt(int numero, int min, int max){
		int[] num=new int[numero];
		for (int i=0; i<num.length; i++)
			num[i]=(int)(Math.random()*(max-min+1)+min);
		return num;
	}
	public static int minimoArrayInt(int[] num){
		int min=num[0];
		for (int i=0; i<num.length; i++) {
			if(num[i]<min)
				min=num[i];
		}
		return min;
	}
	public static int maximoArrayInt(int[] num){
		int max=num[0];
		for (int i=1; i<num.length; i++)
			if(num[i]>max)
				max=num[i];
		return max;
	}
	public static int mediaArrayInt(int[] num){
		int suma=0;
		for (int i=0; i<num.length; i++)
			suma+=num[i];
		return suma/(num.length-1);
	}
	public static boolean estaEnArrayInt(int numero, int[] num){
		boolean encontrado=false;
		for (int i=0; i<num.length && !encontrado; i++)
			if(numero==num[i])
				encontrado=true;
		return encontrado;
	}
	public static int posicionEnArray(int[] num, int numero){
		int posicion=-1;
		boolean encontrado=false;
		for (int i=0; i<num.length && !encontrado; i++)
			if(numero==num[i]){
				posicion=i;
				encontrado=true;
			}
		return posicion;
	}
	public static int[] voltearArrayInt(int[] num){
		int ult=num[num.length-1];
		for (int i=1; i<num.length; i++)
			num[i]=num[i-1];
		num[0]=ult;
		return num;
	}
	public static int[] rotarDerechaArrayInt(int[] num,int n){
		int[] arrayCambiado=num;
		for (int i =0; i<num.length; i++){
			if(i-n>=0)
				arrayCambiado[i-n]=num[i];
		}
		return arrayCambiado;
	}
	public static int[] rotarIzquierdaArrayInt(int[] num,int n){
		int[] arrayCambiado=num;
		for (int i =0; i<num.length; i++){
			if(i-n>=0)
				arrayCambiado[i-n]=num[i];
		}
		return arrayCambiado;
	}
}