import java.util.Scanner;

public class Ej2{
	public static void main(String[] args) {
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int i;
		char[] simbolo=new char[10];
		simbolo[0]='a';
		simbolo[1]='x';
		simbolo[4]='@';
		simbolo[6]=' ';
		simbolo[7]='+';
		simbolo[8]='Q';

		for(i=0;i<simbolo.length;i++)
			System.out.println(simbolo[i]);
	}
}