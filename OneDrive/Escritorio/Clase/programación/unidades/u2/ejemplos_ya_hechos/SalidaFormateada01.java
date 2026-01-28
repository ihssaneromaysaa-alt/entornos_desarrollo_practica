public class SalidaFormateada01{
	public static void main (String[]args){
		System.out.printf("El número %d no tiene decimales. \n",21);
		//%d es para valor entero NO PONERLE COMA AL NÚMERO ,SALE ERROR.
		System.out.printf("El número %f sale con decimales. \n", 21.0);
		//%f es para los reales (double o float).
		System.out.printf("El %.3f sale exactamente con 3 decimales. \n", 21.0);
		//%.nf reales con n decimales.
		
		//Un número entero delante del punto indica en número de caracteres.(alineación.)
		
		
		
		}
	}