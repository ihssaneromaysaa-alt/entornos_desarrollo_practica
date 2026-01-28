public class Prueba2funciones{
	public static void main(String[]args){
		
		//String cad1="En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de escudo antiguo, rocín flaco y galgo corredor. Una olla las más noches, duelos y quebrantos los sábados, algún palomino los domingos, consumían las tres partes de su hacienda. Frisaba la edad de nuestro hidalgo con los cincuenta años; era de complexión recia, seco de carnes, gran madrugador y amigo de la caza.", cad2;
		//System.out.print(cad1.indexOf("Mancha"));
	
		//String builder
		StringBuilder strb=new StringBuilder("Hoal Muuundo");
		System.out.println(strb);
		strb.delete(6,8);
		System.out.println(strb);
		strb.append("!");
		//Esto lo pone al final
		System.out.println(strb);
		strb.insert(0,"¡");
		System.out.println(strb);
		strb.replace(3,5,"la");
		System.out.println(strb);
	
		StringBuilder strb=new StringBuilder("Cadena a rotar");
		System.out.println("CADENA: "+strb);
		for(int i=0;i<strb.length();i++){
			strb.append(strb.charAt(0));strb.delete(0,1);
			System.out.println(strb);
		}
		System.out.println(strb);

	}
}