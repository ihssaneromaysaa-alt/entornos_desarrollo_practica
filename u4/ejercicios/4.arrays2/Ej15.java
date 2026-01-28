/*
en una mesa se pueden sentar de 0 a 4
no grupos mayores de 4
"Lo siento, no admitimos grupos de x, haga grupos de 4
personas como máximo e intente de nuevo."

*/
import java.util.Scanner;
import java.util.Arrays;
public class Ej15{
	public static void main(String [] args){
		//objetos y variables
		Scanner sc = new Scanner (System.in);
		int num, i;
		int[] mesas = new int[10];
		boolean mesaEncontrada=false;

		do{
			mesaEncontrada=false;
			//mostrando mesas:
			for (i = 0; i < mesas.length; i++) {
            	System.out.print("---");
       		}
       		System.out.println();
       		System.out.print("Mesas nº  ");

       		for (i = 0; i < mesas.length; i++) {
            	System.out.print((1+i)+"-");
       		}
       		System.out.println();
       		for (i = 0; i < mesas.length; i++) {
            	System.out.print("---");
       		}
       		System.out.println();
       		
       		System.out.print("Ocupación ");
       		for (i = 0; i < mesas.length; i++) {
            	System.out.print(mesas[i]+"-");
       		}
       		System.out.println();
       		for (i = 0; i < mesas.length; i++) {
            	System.out.print("---");
       		}
			System.out.print("\n¿Cuántos son?(Introduzca -1 para salir del programa): ");
			num=sc.nextInt();
			if(num>=0 && num<=4 && num!=-1){
				//buscando mesa que tenga 0 sitios ocupados:
				for (i=0; i<mesas.length; i++) {
					if(mesas[i]==0){
						System.out.println("Por favor, sientese en la mesa número"+(i+1));
						mesas[i]=mesas[i]+num;
						mesaEncontrada=true;
						i=mesas.length; //para salir del bucle
					}
				}
				if(!mesaEncontrada){
						//buscando mesa que tenga num sitios libre:
						for(i=0; i<mesas.length; i++)
							if((4-mesas[i])>=num){
								System.out.println("Por favor, sientese en la mesa número"+(i+1));
								mesas[i]=mesas[i]+num;
								mesaEncontrada=true;
								i=mesas.length;
							}
						if(!mesaEncontrada)
							System.out.println("Lo siento, no queda sitio en ninguna mesa.");
					}
			}
			else if(num==-1)
				System.out.println("Gracias. Hasta pronto.");
			else
				System.out.println("Lo siento, no admitimos grupos de "+num+", haga grupos de 4 personas como máximo e intente de nuevo.");
		}while(num!=-1);
	}
}