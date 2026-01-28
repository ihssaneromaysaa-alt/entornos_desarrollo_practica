//ejemplo objeto

//creación de clases
import java.awt.Rectangle;
public class EjemploObjeto{
	public static void main(String[] args) {
		//lo siguiente es lo q dimos en clase
		//objetos y variables
		Rectangle r1 = new Rectangle(50, 50, 150, 60);//constructor Rectangle
		//para sacar el objeto y algunas cualidades por
		//pantalla se debe pasar a string
		System.out.println("\n\t"+r1.toString());
		r1.height=100;
		r1.width=50;//lo usual es utilizar setSize
		System.out.println("\n\t"+r1.toString());
		r1.setSize(300,150);
		System.out.println("\n\t"+r1.toString());
		System.out.println("\n\t"+r1.getWidth());
		//crear otro rectangulo
		//Rectangle r2 = new Rectangle(250, 160);
		Rectangle r2 = new Rectangle(50, 50, 150, 100);
		System.out.println("\n\t"+r2.toString());

		if(r1.equals(r2))
			System.out.println("\n\tsame same");
		else
			System.out.println("\n\tnot same same"+r1.toString()+"\t"+r2.toString());

		//cambiar tamaño de segundo rectágulo
		r2.setSize(300,150);

		if(r1.equals(r2))
			System.out.println("\n\tsame same");

		//retomamos la clase
		System.out.println("\n\t"+r1.toString());
		r1.x=80;
		System.out.println("\n\t"+r1.toString());

	}
}
