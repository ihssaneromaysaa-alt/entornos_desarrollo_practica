 public class Pajaro{

	//atributos
	private String nombre;
	private int posX, posY;
	private static int numObjetosPajaro=0;
	//métodos

	//constructores
	public Pajaro(){
		numObjetosPajaro++;
	}
	public Pajaro(String nombre,int posX, int posY){
		this.nombre=nombre;
		this.posX=posX;
		this.posY=posY;
		numObjetosPajaro++;
	}


	//metodo volar
	public double volar(int posX, int posY){
		//d=(raiz cuadrada de x2-x1)^2+(raiz cuadrada de y2-y1)^2
		double d=Math.pow(Math.sqrt(posX-this.posX),2)+Math.pow(Math.sqrt(posY-this.posY),2);
		return d;
	}

	//toString
	public String toString(){
		String cadena=String.format("Nombre: %s;\nPosición x: %d;\nPosición y: %d;\n",nombre,posX,posY);
		return cadena;//tmbn s pueden hacer concatenaciones
	}

	public static int getNumObjPajaro(){
		return numObjetosPajaro;
	}
}