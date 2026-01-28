/*programa:
10 números enteros aleatorios entre 0 y 200
mostrar el contenido del array
junto al índice
dsps el programa deberá colocar de forma alterna y en orden
los menor e iguales de 100 y los mayor de 100: primero
menor, luego mayor, luego menor, luego mayor.. cuando
se acaben los menor o mayor,
se completará con los números q queden*/
public class Ej18_1{
	public static void main(String[] args) {
		//objetos y variables
		int[] num= new int[10];
		int[] ordenado= new int[10];
		int[] menorArray= new int[10];
		int[] mayorArray= new int[10];
		int i, menor=0, cMayor, cMenor, posicion;
		int iMayor, iMenor;

		//rellenando array
		for (i=0; i<num.length; i++) 
			num[i]=(int)(Math.random()*((200-0)+1));
		
		System.out.print("Índice: ");
		for (i=0; i<num.length; i++)
			System.out.printf("%3d ",i);

		System.out.print("\nValor:    ");
		for (i=0; i<num.length; i++)
			System.out.printf("%3d ",num[i]);

		//haré un contador para mayor de 100
		//y otro para menor o iguales a 100
		cMayor=0;
		cMenor=0;
		for (i=0; i<num.length; i++) {
			if(num[i]<=100){
				menorArray[cMenor]=num[i];
				cMenor++;
			}
			else{
				mayorArray[cMayor]=num[i];
				cMayor++;
			}
		}

		posicion=0; //posición del array ordenado
		iMayor=0;
		iMenor=0;
		
		while(posicion<num.length){
			if(iMenor<cMenor){
				ordenado[posicion]=menorArray[iMenor];
				posicion++;
				iMenor++;
			}
			if(iMayor<cMayor){
				ordenado[posicion]=mayorArray[iMayor];
				posicion++;
				iMayor++;
			}
		}

		System.out.print("\n\nÍndice: ");
		for (i=0; i<ordenado.length; i++)
			System.out.printf("%3d ",i);

		System.out.print("\nValor:    ");
		for (i=0; i<ordenado.length; i++)
			System.out.printf("%3d ",ordenado[i]);
	}
}