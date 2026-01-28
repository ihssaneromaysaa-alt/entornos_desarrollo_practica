public class Animal{
	//atributos
	private String nombre, raza; //solo se puede acceder a este
	private short edad;//atributo mediante la clase en la que está

	//metodos

	//gets
	public String getNombre(){
		return nombre;
	}
	public String getRaza(){
		return raza;
	}
	public short getEdad(){
		return edad;
	}
	public String toString(){
		String cadena=String.format("Nombre: %s;\nRaza: %s;\nEdad: %d;\n",nombre,raza,edad);
		return cadena;
	}

	//sets

	public void setNombre(String nuevoNombre){
		nombre=nuevoNombre;
	}
	public void setRaza(String nuevaRaza){
		raza=nuevaRaza;
	}
	public void setEdad(short nuevaEdad){
		edad=nuevaEdad;
	}

	public void cumplirAnios(){
		edad++;
	}

	//contructor
	public Animal(){
	}

	public Animal(String nombre, String raza, short edad){
		this.nombre=nombre;
		this.raza=raza;
		this.edad=edad;
	}
	
	public Animal(String nombre, String raza){
		this.nombre=nombre;
		this.raza=raza;
	}

	//añadimos método main
	public static void main(String[] args) {
		Animal perro=new Animal();
		perro.setNombre("puppy");
		perro.setRaza("bulldog");
		perro.setEdad((short)2);//casting
		System.out.print(perro);//print cuando detecta un 
		//objeto por defecto le pone
		//el toString()
		System.out.println("\nCumpliendo años: ");
		perro.cumplirAnios();
		System.out.print(perro);


		Animal gato = new Animal("mishi","felis catus",(short)3);
		System.out.print(gato);
		
	}
}