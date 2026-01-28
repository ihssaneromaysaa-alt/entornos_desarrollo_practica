import java.util.Scanner;
public class Ej11{
	public static void main (String[] args){

		//Objetos y variables
		Scanner sc=new Scanner(System.in);
		String color;
		char orden='f';
		StringBuilder lista=new StringBuilder("");
		int numColores;

		for(numColores=0;numColores<5;numColores++){
			if(!lista.toString().equals(""))
				System.out.println("Tenemos la siguiente lista: "+lista);

			System.out.print("Color: ");
			color = sc.nextLine();

			if(numColores!=0)
				do{	
					System.out.print("¿Al final o al principio? (f/p): ");
					orden = sc.nextLine().toLowerCase().charAt(0);

					if (orden!='f' && orden!='p') {
						System.out.println("Orden no válido");
					}
				}while(orden!='f' && orden!='p');

			if(numColores==0)
				lista=(orden!='f')?lista.insert(0,color):lista.append(color);
			else
				lista=(orden!='f')?lista.insert(0,color+" "):lista.append(" "+color);

			System.out.println(lista);
		}
	}
}