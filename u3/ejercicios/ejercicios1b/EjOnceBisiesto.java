import java.util.Scanner;
public class EjOnceBisiesto{
	public static void main(String[]args){
	
		//Objetos y variables
		Scanner sc = new Scanner(System.in);
		int year;
		
		//Entrda de datos
		System.out.println("Introduzca una año");
		year=sc.nextInt();
		
		//Salida de datos
		if(year%400==0)
			System.out.println(year+" es bisiesto");
		else 
            if(year % 100 == 0)
                System.out.println(year + " no es bisiesto");
             else
                if(year % 4 == 0)
					System.out.println(year + " es bisiesto");
                else
					System.out.println(year + " no es bisiesto");
				
				
				
				
				
				
				
				
				
				
		//if(((year%400==0) && (year % 100 != 0) && (year % 4 == 0)))
	}
}