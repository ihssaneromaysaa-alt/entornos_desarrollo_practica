import java.util.Scanner;
public class Ej1{
	public static void main(String[] args) {
		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		int[] num=new int[12];
		int i;

		num[0]=39;
		num[1]=-2;
		num[4]=0;
		num[6]=14;
		num[8]=5;
		num[9]=120;
		for(i=0;i<num.length;i++)
			System.out.println(num[i]);
		
	}
}