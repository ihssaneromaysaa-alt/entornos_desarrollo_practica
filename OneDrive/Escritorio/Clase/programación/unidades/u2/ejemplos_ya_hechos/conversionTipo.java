import java.util.Scanner;
public class conversionTipo{
	public static void main(String[]args){
		
		//Fecha 20/10/25
		
		//---------------------------------------------
		
		//Objetos y variables.
		/*int a=12345,b;
		
		//Problema
		//Conversión automática y explícita. De int a long.
		//Conversión automática.
		//b=a
		//a=(int)b;
		
		//System.out.printf("Valor de a=%d, valor de b=%d",a,b);
		
		//No se puede convertir de long a int, ya que puede ocurrir una
		//pérdida de información.
		
		//---------------------------------------------
		
		//Conversión explícita.
		
		double division;
		a=10;
		b=3;
		division=(double)a/b;La diferencia de poner double o no,
		es q si lo pones te muestra el resto
		System.out.printf("%d/%d=%f",a,b,division);
		
		//---------------------------------------------
		
		//Ejempli ci
		
		double d=45.93;
		long x;
		
		x=Math.round(d);//Devuelve un long en un entero
		System.out.printf("Round (redondea hacia arriba) de x es %d\n",x);
		x=(int)Math.ceil(d);//Este devuelve un double
		System.out.printf("\nCeil (redondea hacia arriba da igual su\n proximidad) de x es %d\n",x);
		x=(int)Math.floor(d);//Este devuelve un double
		System.out.printf("\nFloor (redondea hacia abajo) de x es %d\n",x);
		
		//---------------------------------------------
		
		//Ejemplo char
		
		int num;
		char c;
		
		c='A';
		
		num=(int)c;
		System.out.printf("\nEl int de %c es %d",c,num);
		
		num+=1;
		c=(char)num;
		System.out.printf("\nEl char de %d es %c",num,c);
		
		//ASCII está en orden alfabético.
		
		
		//---------------------------------------------
		
		int x;
		String cad;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dame un valor de x");
		x=sc.nextInt();
		System.out.println("Dame un valor de cad");
		//No funciona, necesito limpiar el buffer.
		sc.nextLine();//Hay otra forma de hacer esto
		cad=sc.nextLine();
		System.out.printf("x=%d y cad=%s",x,cad);
		System.out.println("\nGracias");
		
		//La otra forma:
		
		int x;
		String cad;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dame un valor de x");
		x=Integer.parseInt(sc.nextLine());
		System.out.println("Dame un valor de cad");
		//sc.nextLine(); //Ya no se necesita esta parte del programa
		cad=sc.nextLine();
		x+=2;
		System.out.printf("x=%d y cad=%s",x,cad);
		System.out.println("\nGracias");*/
		
		//Convertir cadena en valor entero
		
		int x;
		String cad;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dame un valor de x");
		x=Integer.parseInt(sc.nextLine());
		System.out.println("Dame un valor de cad");
		//sc.nextLine(); //Ya no se necesita esta parte del programa
		cad=sc.nextLine();
		x+=2;
		cad=String.valueOf(23);//Le damos un entero y nos devuelve un string
		System.out.printf("x=%d y cad=%s",x,cad);
		System.out.println("\nGracias");

	}
}