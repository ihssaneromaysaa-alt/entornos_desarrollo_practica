import java.util.Scanner;
public class Ej2{
	public static void main(String[] args) {
		//objetos y variables
		Scanner sc=new Scanner(System.in);
		int[][] num=new int[4][5];
		int i,j,suma;

		for (i=0; i<num.length; i++) {
			for (j=0; j<num[i].length; j++) {
				System.out.print("\nIntroduzca el número de la fila "+i+" y la columna "+j+": ");
				num[i][j]=sc.nextInt();
			}
		}

		//enseñandolos y sumandolos
		//suma filas
		System.out.println();
		for (j = 0; j < num[0].length; j++){
			suma=0;
		    for (i = 0; i < num.length; i++){
				System.out.print( num[i][j]  + "\t");
			    suma+=num[i][j];
			}
		    System.out.printf("%3d\n",suma);
		}
		//suma columnas
		for(i=0;i<num.length;i++){
			suma=0;
		    for (j=0; j<num.length; j++) {
		    	suma+=num[j][i];
		    }
		    System.out.print(suma+"\t");
		}
	}
}