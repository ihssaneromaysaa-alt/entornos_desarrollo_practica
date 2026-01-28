/*
7. Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año
y que muestre a continuación un diagrama de barras horizontales con esos datos. Las barras del
diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter. Usa un tipo de dato enum
para los meses.
*/
import java.util.Scanner;
public class Ej7{
	public static void main(String[] args) {
		enum Mes{
			ENERO,
	    	FEBRERO,
	    	MARZO,
	    	ABRIL,
	    	MAYO,
	    	JUNIO,
	    	JULIO,
	    	AGOSTO,
	    	SEPTIEMBRE,
	    	OCTUBRE,
	    	NOVIEMBRE,
	    	DICIEMBRE
		}
		//Objetos y variables
		Scanner sc= new Scanner(System.in);
		double[] temp=new double[12];
		int i=0,j;


		for(Mes mes: Mes.values()){
			System.out.print("Introduzca la temperatura del mes "+mes+": ");
			temp[i]=sc.nextInt();
			i++;
		}
		System.out.println();
		
		//Diagrama
		System.out.println("");
		for(j=0;j<temp.length;j++){
			System.out.print("Mes "+j+": ");
			if(temp[j]>0 && j<10){
				System.out.print("                     |");
			}
			else if (temp[j]>0) {
					System.out.print("                    |");
			}
			else if(temp[j]<0){
				for(i=0;i<(20+(int)temp[j]);i++)
					System.out.print(" ");
			}
			/*
			Tenemos temp[i]: por ejemplo a -16
			20-16=i=4
			System.out.println(" ");*/
			for(i=0;i<(int)Math.abs(temp[j]);i++){
				if(temp[j]>0){
					System.out.print("*");
				}
				else
					System.out.print("^");	
			}
			if(temp[j]<0){
				System.out.print("|");
			}
			System.out.println();
		}
	}
}