public class Ej9{
	public static void main(String[]args){
		
		//Objetos y variables
		String a="Esto es un String", b="Y esto también", c, d;
		String resultado="", vocales="aeiou";
		String cadena;
		int num;
		
		//Comparación
		resultado=(a.equals(b))?" es igual a ":" no es igual a ";
		System.out.println(a+resultado+b);
		
		//Operación
		c=a+b;
		d=a+b;
		
		resultado=(c.equals(d))?" es igual a ":" no es igual a ";
		System.out.println(c+" "+resultado+" "+d);
		
		num=a.length()+b.length()+c.length()+d.length();
		System.out.println(a+"tiene "+(a.length()-1)+" caracteres");
		System.out.println(b+"tiene "+(b.length()-1)+" caracteres");
		System.out.println(c+"tiene "+(c.length()-1)+" caracteres");
		System.out.println(d+"tiene "+(d.length()-1)+" caracteres");
		
		b=a;
		a.replace("String","b");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}