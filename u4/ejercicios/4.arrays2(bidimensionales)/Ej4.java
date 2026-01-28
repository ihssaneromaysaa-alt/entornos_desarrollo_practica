/*Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números*/

public class Ej4{
	public static void main(String[] args) {
		//objetos y variables
		int[][] num=new int[4][5];
		int i,j,suma;

		for (i=0; i<num.length; i++) {
			for (j=0; j<num[i].length; j++) {
				num[i][j]=(int)(Math.random()*((999-100)+1));
			}
		}

		//enseñandolos y sumandolos
		//suma filas
		System.out.println();
		for (j = 0; j < num[0].length; j++){
			//suma=0;
		    for (i = 0; i < num.length; i++){
				System.out.print( num[i][j]  + "\t");
			    //suma+=num[i][j];
			}
		    //System.out.printf("fila Σ %3d\n",suma);
		}

		//sumando
		for (j = 0; j < num[0].length; j++){
			suma=0;
		    for (i = 0; i < num.length; i++){
				//System.out.print( num[i][j]  + "\t");
			    suma+=num[i][j];
			}
			System.out.print("Sumando");
			for (int k=0; k<3; k++) {
				System.out.print(".");
			}
		    System.out.printf("fila número "+j+" Σ %3d\n",suma);
		}

		//columnas
		for(i=0;i<num.length;i++){
			suma=0;
		    for (j=0; j<num.length; j++) {
		    	suma+=num[j][i];
		    }
		    System.out.print("Sumando");
			for (int k=0; k<3; k++) {
				System.out.print(".");
			}
		    System.out.printf("columna número "+i+" Σ %3d\n",suma);
		}

	}
}