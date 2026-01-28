import java.util.Scanner;
import java.util.Arrays;
public class Ej7{
	public static void main(String[] args){
		//objetos y variables
		Scanner sc=new Scanner(System.in);
		int[][] minas= new int[10][10];
		int i,j;
		int columna,fila;

		//1=mina
		//0=no mina
		for(i=0; i<minas.length;i++)
			for (j=0; j<minas[i].length; j++)
				minas[i][j]=(int)(Math.random()*2);

		for (i=0; i<minas.length; i++){
			for (j=0; j<minas.length; j++)
				System.out.printf("%2d, ",minas[i][j]);
			System.out.println();
		}

		System.out.print("Introduzca una columna (del 0 al 9):");
		columna=sc.nextInt();
		System.out.print("Introduzca una fila (del 0 al 9):");
		fila=sc.nextInt();

		if(minas[columna][fila]==1)
			System.out.print("BOOM");
		else if(columna==0 && fila==0 && ( 
			minas[1+columna][1+fila]==1
			|| minas[columna][1+fila]==1
			|| minas[1+columna][fila]==1) ||
			columna==9 && fila==0 && ( 
			minas[columna-1][fila]==1
			|| minas[columna][1+fila]==1) ||
			columna==9 && fila==9 &&(
			minas[columna-1][fila-1]==1 
			|| minas[columna][fila-1]==1
			|| minas[columna-1][fila]==1) ||
			columna==0 && fila==9 &&(
			minas[columna][fila-1]==1
			|| minas[1+columna][fila]==1))
			System.out.print("¡Cuidado! Hay una mina cerca");
		else if(fila==0 && (
			minas[columna-1][fila]==1
			|| minas[1+columna][1+fila]==1
			|| minas[columna][1+fila]==1
			|| minas[1+columna][fila]==1) ||
			columna==0 && (
			minas[1+columna][1+fila]==1
			|| minas[columna][1+fila]==1
			|| minas[1+columna][fila]==1
			|| minas[columna][fila-1]==1) ||
			fila==9 && (minas[columna-1][fila-1]==1 
			|| minas[columna][fila-1]==1
			|| minas[columna-1][fila]==1
			|| minas[1+columna][fila]==1) ||
			columna==9 && (minas[columna-1][fila-1]==1 
			|| minas[columna][fila-1]==1
			|| minas[columna-1][fila]==1
			|| minas[columna][fila+1]==1))
			System.out.print("¡Cuidado! Hay una mina cerca");
		else if(minas[columna-1][fila-1]==1 
			|| minas[columna][fila-1]==1
			|| minas[columna-1][fila]==1
			|| minas[1+columna][1+fila]==1
			|| minas[columna][1+fila]==1
			|| minas[1+columna][fila]==1)
			System.out.print("¡Cuidado! Hay una mina cerca");
		else
			System.out.print("U COOL DW TWIN");
	}
}