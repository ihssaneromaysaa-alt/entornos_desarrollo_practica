import java.util.Scanner;
import java.util.Arrays;
public class Ej12{
	public static void main(String[] args) {
		//objetos y variables
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		int inicialN,finalN,i, repuesto, orden=0, numeroGuardado;

		//números random entre el 0 y el 9
		for (i=0; i<num.length; i++) {
			num[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(num));

		System.out.print("\ninicial: ");
		inicialN=sc.nextInt();
		numeroGuardado=num[inicialN];

		System.out.print("\nfinal: ");
		finalN=sc.nextInt();

		if(inicialN<finalN && 
			inicialN<=9 &&
			inicialN>=0 &&
			finalN<=9 &&
			finalN>=0){
			//System.out.println("formato correcto (cool)");
			
			//ahora tenemos que rotar los números del array
			
			for (i=inicialN; i>=1; i--) {
				num[i]=num[i-1];
			}
			if(inicialN>=0 && finalN>=0)
				num[0]=num[num.length-1];
			for (i=num.length-1; i>finalN; i--) {
				num[i]=num[i-1];
			}
			num[finalN]=numeroGuardado;
		}
		else
			System.out.println("formato incorrecto (uncool)");
		System.out.println(Arrays.toString(num));

	}
}