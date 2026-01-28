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
	public static double mediaArrayInt(int[] num){
		int suma=0;
		for (int i=0; i<num.length; i++)
			suma+=num[i];
		return (double)(suma/(num.length));
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
				i=num.length;
			}
		return posicion;
	}
	public static int[] voltearArrayInt(int[] num){
		int temp,i;
		for (i=0; i<num.length/2; i++) {
	        temp=num[i];
	        num[i]=num[num.length-i-1];
	        num[num.length-i-1]=temp;
    	}
		return num;
	}

	public static int[] rotarDerechaArrayInt(int[] num,int n){
		int[] ultimos = new int[n];
		int i;
    	n=n%num.length;
	    for (i=0; i<n; i++)
			ultimos[i] = num[num.length-n+i];//números q causan problemas
	    //desplazamos todo hacia la derecha
	    for (i=num.length-1; i>=n; i--)
			num[i] = num[i-n];
	    //ponemos los últimos al principio
	    for (i=0; i<n; i++)
	        num[i]=ultimos[i];
	    return num;
	}

	public static int[] rotarIzquierdaArrayInt(int[] num, int n) {
	    int i, primeros;
	    n = n%num.length;
	    primeros = num[0];// guardamos el primero
	    for (i = 0; i < num.length - n; i++) {
	        num[i] = num[i+n];
	    }
	    // ponemos los primeros elementos al final
	    for (i=0; i<n; i++) {
			num[num.length-n+i]=primeros;
	        if (i<n-1)
				primeros = num[i+1]; // vamos guardando el siguiente
		}
    	return num;
	}
	
}