/*
Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.
*/
public class Ej5{
	public static void main(String[]args){
		int i,j,max,min, posMaxColumna=0,posMaxFila=0,posMinColumna=0,posMinFila=0;
		int[][] num=new int[6][10];
		
		//rellenando array
		for (i=0; i<num.length;i++ ) {
			for (j=0; j<num[i].length; j++) {
				num[i][j]=(int)(Math.random()*((1000-0)+1));
			}
		}

		System.out.println();
		for (i = 0; i < num.length; i++){
		    for (j = 0; j < num[i].length; j++)
				System.out.print( num[i][j]  + "\t");
			System.out.println();
		}

		//buscando máximo e mínimo
		max=num[0][0];
		min=num[0][0];
		for(i=0;i<num.length;i++){
			for(j=0; j<num[i].length; j++){
				if(num[i][j]>max){
					max=num[i][j];
					posMaxColumna=j;
					posMaxFila=i;
				}
				if(num[i][j]<min){
					min=num[i][j];
					posMinColumna=j;
					posMinFila=i;
				}
			}
		}
		System.out.print("La posición del máximo es: "+posMaxColumna+", "+posMaxFila);
		System.out.print("\nLa posición del mínimo es: "+posMinColumna+", "+posMinFila);
	}
}