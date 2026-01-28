import java.util.Scanner;
//programa:
/*
q muestre por pantalla un array de 10 (int[]) (del 0 al 100)
pedir número al usuario
comprobar q ese número esté en el array
mostrar mensaje si no y volver a pedir número
se rota el array hacia la derecha las veces que haga falta
?? wth
->(hacia la derecha ok?)
se rotará las veces q sea necesario hasta que el número intr
oducido quede en la posición cero del array
y por último se mostrará el array rotado por pantalla
*/
public class Ej17{
	public static void main(String[]args){
		//objetos y variables
		Scanner sc=new Scanner(System.in);
		int i, j, numElegido, repuesto, ultimo, numRotaciones=-1;
		int[] num=new int[10];
		boolean numEncontrado=false;//para parar el primer while

		//introduciendo números aleatorios del 0 al 100
		for (i=0; i<num.length; i++) 
			num[i]=(int)(Math.random()*(100-0)-1);

		//enseñando array
		for (i=0; i<num.length; i++)
			System.out.print(num[i]+" ");

		//pedir número con un do while
		System.out.print("\nEliga un número del array mostrado: ");
		do{
			numElegido=sc.nextInt();
			for(i=0; i<num.length; i++){
				if(numElegido==num[i]){
					numEncontrado=true;
					numRotaciones=num.length-i;
					//la variable numRotaciones es muy importante
					//guarda el número de rotaciones que tendremos
					//que realizar para que el número esté en la
					//posición 0
					i=num.length;
				}
			}
			if(!numEncontrado){
				System.out.println("Vuelva a introducir el número");
				System.out.print("(tiene que estar en el array):");
			}
		}
		while(!numEncontrado);

		//rotar el array hacia la derecha
		//hasta que numElegido este en la posición cero
		for (i=0; i<numRotaciones; i++) {
			ultimo=num[num.length-1];
			for (j=num.length-1; j>0; j--)
				num[j]=num[j-1];			
			num[0]=ultimo;
		}
		//enseñando array
		System.out.println();
		for (i=0; i<num.length; i++)
			System.out.print(num[i]+" ");
	}
}