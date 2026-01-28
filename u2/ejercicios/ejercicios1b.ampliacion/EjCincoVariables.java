public class EjCincoVariables{
	public static void main(String [] args){
	
	//Objetos y variables
	char a='a',b='b',c='c',d='d',e='e';
	String cad="",cad1="";/*En este caso hay que inicializar 
	la cadena para evitar problemas*/
	
	//Enunciado: Poner las variables char en una cadena.
	//¿Problemas?¿Soluciones?
	
	//Intento de convertirlo a cadena:
	cad+=a;
	cad+=b;
	cad+=c;
	cad+=d;
	cad+=e;
	
	cad1+=a+b+c+d+e; //En este caso se hace la suma de los números
	//correspondientes de ASCII
	
	System.out.printf("La cadena completa de los caracteres es %s",cad);
	//System.out.printf("\nEn cambio la suma de sus números \nASCII correspondientes es %s",cad1);
	
	/*¿Problemas?¿Soluciones?
	
	Uno de los problemas fue no iniciar cad antes de utilizarla
	
	El segundo problema fue la concadenación de caracteres, ya que
	se supone que no las puedo concadenar si la variable no está iniciada
	o si no se suma con un carácter.
	
	También existe un problema con el que no me he topado al principio y
	es unir la cadena completa, ya que si lo unes todo de golpe en una
	sentencia pues se suman y aparecen números en vez de la cadena en sí.
	
	
	*/
	}
}