//pasar parámetro por valor y por referencia
public class Parametro{
	/*
	public static int incrementar10(int a){
		a+=10;
		return a;
	}
	public static void main(String[] args) {
		int a=5;
		int b=incrementar10(a);//se pasa una copia de a
		System.out.println("Valor de a: "+a);
		System.out.println("Valor de b: "+b);
		//cuando se pasan variables se pasa una copia
		//cuando se pasa un objeto se pasa una referencia,
		//en el caso de cambiarlo, se cambia el original también
	}*/
	//cambiar por referencia:
	public static void addCaracter(StringBuilder a, char c){
		//definición de un método
		a.append(c);
	}
	public static void addCaracter(StringBuilder a, char c,char d){
		a.append(c);
		a.append(d);
	}
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("1234");
		char letra='*';
		addCaracter(sb,letra);//llamada
		System.out.print(sb);
	}
}