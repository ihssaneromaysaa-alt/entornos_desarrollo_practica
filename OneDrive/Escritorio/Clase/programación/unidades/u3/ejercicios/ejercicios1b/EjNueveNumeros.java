import java.util.Scanner;
public class EjNueveNumeros{
	public static void main (String[]args){
	
	//Objetos y variables
	Scanner sc = new Scanner (System.in);
	int var1,var2,var3;
	
	//Entrada de datos
	System.out.println("Introduzca el primer número");
	var1=sc.nextInt();
	
	System.out.println("Introduzca el segundo número");
	var2=sc.nextInt();
	
	System.out.println("Introduzca el tercero número");
	var3=sc.nextInt();
	
	//Salida
	if(var1>var2&&var2>var3)
		System.out.println(var1+">"+var2+">"+var3);
	
	else
		if(var2>var1&&var1>var3)
			System.out.println(var2+">"+var1+">"+var3);
		else
			if(var2>var1)
				System.out.println(var3+">"+var2+">"+var1);
			else
				System.out.println(var3+">"+var1+">"+var2);
	}
}