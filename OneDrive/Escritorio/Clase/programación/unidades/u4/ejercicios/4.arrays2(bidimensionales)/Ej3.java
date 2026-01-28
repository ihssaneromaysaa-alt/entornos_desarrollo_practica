/*Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).*/
public class Ej3{
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
		System.out.println("-------------------------------");
		for (j = 0; j < num[0].length; j++){
			suma=0;
		    for (i = 0; i < num.length; i++){
				System.out.print( num[i][j]  + "\t");
			    suma+=num[i][j];
			}
		    System.out.printf("| %2d\n",suma);
		}
		//suma columnas
		System.out.println("-------------------------------");
		for(i=0;i<num[0].length;i++){
			suma=0;
		    for (j=0; j<num.length; j++) {
		    	suma+=num[j][i];
		    }
		    System.out.print(suma+"\t");
		}
	}
}