//ajedrez, alfil
import java.util.Scanner;
import java.util.Arrays;
public class Ej8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char posCol;//columna=letras
		int posFil, i, j;//fila=números
		int columna=0,fila=0;
		boolean encontrado=false;//por si encontramos la posicion
		String posicion;
		String[] posiblesMov= new String[15];
		String[][] tablero={{"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},
							{"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
							{"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
							{"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
							{"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
							{"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
							{"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
							{"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"}};
		//ahora pedimos posición
		System.out.print("Introduzca la columna(letra): ");
		posCol=sc.nextLine().trim().charAt(0);
		System.out.print("Introduzca la fila(número): ");
		posFil=sc.nextInt();
		posicion=Character.toString(posCol)+Integer.toString(posFil);
		//System.out.print(posicion);

		//ahora tenemos que buscar las posiciones
		//donde el alfil pueda posicionarse
		//1.buscamos la posicion escrita por el usuario en el array del tablero
		for(i=0;i<tablero.length && !encontrado;i++)
			for(j=0; j<tablero[i].length && !encontrado; j++)
				if(tablero[i][j].equalsIgnoreCase(posicion)){
					encontrado=true;
					columna=i;
					fila=j;
				}
		//2. y dsps las posiciones en las q pueda moverse
		//tenemos esta posición: columna y fila
		//y lo que queremos es identificar el posiciones
		//contador posiblesMov
		int k=0;
		for(i=1; fila-i>=0 && columna+i<tablero.length;i++){
			posiblesMov[k]=tablero[fila-i][columna+i];
			k++;
		}

		for(i=1; fila-i>=0 && columna-i>=0;i++){
			posiblesMov[k]=tablero[fila-i][columna-i];
			k++;
		}
		
		for(i=1; fila+i<tablero.length && columna+i<tablero.length;i++){
			posiblesMov[k]=tablero[fila+i][columna+i];
			k++;
		}

		for(i=1; fila+i<tablero.length && columna-i>=0;i++){
			posiblesMov[k]=tablero[fila+i][columna-i];
			k++;
		}
		k=k-1;
		System.out.print("Posibles movimientos: ");
		for(i=0;i<k;i++)
			System.out.printf("%3s ",posiblesMov[i]);
	}
}
/*
abcdefgh
12345678
*/