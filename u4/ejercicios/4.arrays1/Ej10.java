import java.util.Arrays;
public class Ej10{
	public static void main(String[] args) {
		//Objetos y variables
		int[] num=new int[20];
		int[] pares=new int[20];
		int[] impares=new int[20];
		int i;
		int index=0;//contador para reconstruir array
		int im=0;//contador impares
		int p=0;//contador pares
		System.out.println("\n----Array ordenado----");
		for(i=0;i<num.length;i++){
			num[i]=(int)(Math.random()*(100-0+1)-0);
			System.out.println((i+1)+".\s"+num[i]);
		}
		//Realización del problema
		//--separación de pares e impares
		for(i=0;i<num.length;i++){
			if(num[i]%2==0){
				pares[p++]=num[i];
			}
			else{
				impares[im++]=num[i];
			}
		}
		//--reordenando
		for(i=0;i<p;i++){
			num[index++]=pares[i];
		}
		for(i=0;i<im;i++){
			num[index++]=impares[i];
		}
		//Salida
		System.out.println("\n----Array reordenado----");
		for(i=0;i<num.length;i++)
			System.out.println((i+1)+".\s"+num[i]);
	}
}