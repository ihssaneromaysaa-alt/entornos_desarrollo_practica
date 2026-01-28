public class Prueba2funciones{
	public static void main(String[]args){
	
		String cad1="A", cad2="An";
		float precio=3.3f;
		boolean bo=false;
		char c1, c2;
		boolean ordenada=false;
		int i;
		int cadL;
		/*
		String salida=String.format("El precio es: %.2f", precio);
		salida+=" €";
		System.out.println(salida);
		System.out.println(cad1+cad2);
		System.out.println(cad1.compareTo(cad2));
		//bo=();
		for(int i=0;i<cad2.length() && !ordenada;i++){
			c1=cad1.charAt(i);
			c2=cad2.charAt(i);
			//c1.compareTo(c2);
			if(c1>c2){System.out.print(cad1+"-"+cad2);ordenada=true;}
			else if(c2>c1){System.out.print(cad2+"-"+cad1);ordenada=true;}
		}
		if(!ordenada)
			System.out.print("Son iguales");*/
		if(cad1.compareTo(cad2)<0)
			System.out.print(cad1+" menor "+cad2);
		else if(cad1.compareTo(cad2)>0)
			System.out.print(cad1+" mayor "+cad2);
		else
			System.out.print(cad1+" igual "+cad2);
	}
}