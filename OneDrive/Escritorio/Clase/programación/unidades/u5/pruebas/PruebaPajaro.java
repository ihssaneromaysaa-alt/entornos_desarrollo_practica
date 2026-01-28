public class PruebaPajaro{
	public static void main(String[] args) {
		//objetos y variables
		Pajaro p1=new Pajaro();
		Pajaro p2=new Pajaro("Pajaro2",20,30);

		//salida
		System.out.println("\n"+p1);
		System.out.println("\n"+p2);

		System.out.println("Recorrido: "+p1.volar(5,5));

		System.out.println("Recorrido: "+p2.volar(30,40));
		//p1.nombre="papajarin";
		System.out.println("\n"+p1);

		//para compilar todas los archivos java se hace con asterisco
		//javac *.java

		//utilizando método estático y atributo estático
		//sacamos el número de objetos creados de pájaro

		System.out.print("\nNúmero de objetos pájaro creados: "+Pajaro.getNumObjPajaro());
	}
}