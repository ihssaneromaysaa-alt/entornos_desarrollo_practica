import java.util.Scanner;

public class Ej1{
	public static void apartado1(){

	}
	public static int sumar1(int x){
		x++;
		return x;
	}
	public static float sumarAmbos(float a, float b){
		float c=a+b;
		return c;
	}
	public static String limpiarPantalla(){
		String cadena="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		cadena+="\n----------------------------------------------------------------------------------------------";
		return cadena;
	}
	public static String dibujarCuadrado(int x){
		String cadena="";
		int i,j;
		for (i=0; i<=x; i++)
			cadena+="*";
		cadena="\n";
		for (i=0; i<=x; i++) {
			cadena+="*";
			for (j=1; j<x; j++)
				cadena+="\s";
			cadena+="*\n";
		}
		for (i=0; i<=x; i++)
			cadena+="*";
		return cadena;
	}
	public static int obtenerSigno(double x){
		if(x<0)
			return -1;
		else if(x>0)
			return 1;
		else
			return 0;
	}
	public static int factorial(int a){
		int i, factorial=1;
		for (i=1; i<=a; i++)
			factorial*=i;
		return factorial;
	}
	public static String primo(int num){
		if(num<=1)
			return "no es primo";
		for (int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0)
				return "no es primo";
		}
		return "es primo";
	}
	public static int esNum(int num){
		if(primo(num).equals("es primo"))
			return num;
		else
			return 0;
	}
	public static boolean esDigito(char letra){
		boolean resultado;
		if(Character.isDigit(letra))
			resultado=true;
		else 
			resultado=false;
		return resultado;
	}
	public static boolean esDigito2(char letra){
		boolean resultado=false;
		if(Character.isDigit(letra))
			resultado=true;
		return resultado;
	}
	public static boolean esDigito3(char letra){
		return Character.isDigit(letra);
	}
	public static boolean esDigito4(char letra){
		return Character.toString(letra).matches("[A-z]");
		//la letra no es un objeto asi q no funciona
		//Character.toString(char)
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int opcion, num;
		double nReal;
		float a,b;
		char letra;
		boolean salir=false;
		System.out.print("\n\n1. Crea un método que no reciba nada como parámetro y no devuelva nada.\n\n2. Crea un método que reciba como parámetro un entero y devuelva ese entero incrementado\n\n3. Crea un método que reciba dos flotantes y devuelva la suma de los dos.\n\n4. Crea un método llamado limpiarPantalla, que borre la pantalla dibujando 25 líneas en blanco.\n\n5. Crea un método llamado dibujarCuadrado que recibe un valor entero N y dibuja un\ncuadrado formado por N filas con N asteriscos cada una.\n\n6. Crea un método llamado obtenerSigno, que reciba un número real, y devuelva un\nnúmero entero con el valor: -1 si el número es negativo, 1 si es positivo o 0 si es cero.\n\n7. Crea un método que reciba un entero y devuelva su factorial.\n\n8. Crea un método que reciba un entero y “nos diga” si es primo o no\n\n9. Crea un método que reciba un entero y devuelva ese entero si es un número primo o 0 en\ncualquier otro caso. Tiene que usar el método anterior.\n\n10. Crea un método que dado un carácter, diga si se trata de un número o no.\n\n\n");

		do{
			num=0;a=0;b=0;nReal=0;
			System.out.print("\nEliga una opción:\n");
			opcion=sc.nextInt();
			sc.nextLine();
			switch(opcion){
				case 0:
					salir=true;
					break;
				case 1:
					System.out.print("\nEl resultado del método es: ");
					apartado1();
					break;
				case 2:
					System.out.print("\nIntroduzca un valor para sumarle uno: ");
					num=Integer.parseInt(sc.nextLine());
					System.out.print("El resultado del método es: "+sumar1(num));
					break;
				case 3:
					System.out.print("\na: ");
					a=(float)sc.nextInt();
					System.out.print("\nb: ");
					b=(float)sc.nextInt();
					System.out.print("El resultado del método es: "+sumarAmbos(a,b));
					break;
				case 4:
					System.out.print("El resultado del método es: "+limpiarPantalla());
					break;
				case 5:
					System.out.print("Escriba la longitud del cuadrado: ");
					num=Integer.parseInt(sc.nextLine());
					System.out.print("El resultado del método es: "+dibujarCuadrado(num));
					break;
				case 6:
					System.out.print("Introduzca un número real: ");
					nReal=Double.parseDouble(sc.nextLine());
					System.out.print("El resultado del método es: "+obtenerSigno(nReal));
					break;
				case 7:
					System.out.print("Introduzca el número para realizar su factorial: ");
					num=Integer.parseInt(sc.nextLine());
					System.out.print("Resultado del factorial es: "+factorial(num));
					break;
				case 8:
					System.out.print("Introduzca un número para darte a conocer si es primo o no lo ");
					num=Integer.parseInt(sc.nextLine());
					System.out.print("El resultado del método es: "+primo(num));
					break;
				case 9:
					System.out.print("Introduzca un número: ");
					num=Integer.parseInt(sc.nextLine());
					System.out.print("El resultado del método es: ");
					break;
				case 10:
					System.out.print("Introduzca una letra:");
					letra=sc.nextLine().charAt(0);
					System.out.print("El resultado del método: "+esDigito4(letra));
					break;
				}
		}while(!salir);
	}
	
}