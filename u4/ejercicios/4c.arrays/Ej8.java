/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en
un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del
array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares
si es necesario.
*/
//Realización del problema
/*Lo que haré será tener dos índices
el impar de izquierda a derecha
el par de derecha a izq
cuando alguno sea mayor que cero
(los inicializaré con menos 1)
se intercambian los números
*/

public class Ej8{
	public static void main(String[] args) {
		//Objetos y variables
		int[] num=new int[20];
		int[] numOriginal=new int[20];
		int i=0, j, repuesto;

		//Entrada
		for(i=0;i<num.length;i++){
			num[i]=(int)(Math.random()*((100+0)+1));
			numOriginal[i]=num[i];
		}
	
		j=num.length-1;
		i=0;
		while(i<j){
			while(i<j && num[i]%2==0)
				i++;//si es par el número de la izq lo dejamos
			while(i<j && num[j]%2!=0)
				j--;//si es impar el número de la der lo dejamos
			while(i<j && num[j]%2==0 && num[i]%2!=0){
				repuesto=num[j];
				num[j]=num[i];
				num[i]=repuesto;
				i++;
				j--;
			}
		}
	System.out.println("   Original  --  Ordenado");
	for(i=0;i<num.length;i++){
			System.out.printf(" %2d.   %4d  -- %5d \n",(i+1),numOriginal[i],num[i]);
		}
	}
}