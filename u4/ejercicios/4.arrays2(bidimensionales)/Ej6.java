public class Ej6{
	public static void main(String[]args){
		int i,j,k,h,max,min, posMaxColumna=0,posMaxFila=0,posMinColumna=0,posMinFila=0, nuevoNumero;
		int[][] num=new int[6][10];
		boolean numRepetido=false;
		
		//rellenando array
		for (i=0; i<num.length;i++ ) {
			for (j=0; j<num[i].length; j++) {
				//num[i][j]=(int)(Math.random()*((1000-0)+1));
				numRepetido=false;
				do{
					nuevoNumero=(int)(Math.random()*((1000-0)+1));
					for (k=0; k<num.length && k<i && !numRepetido; k++) {
						for (h=0; h<num[k].length && h<j && !numRepetido; h++) {
							//solo miramos posiciónes ya rellenadas
							if (nuevoNumero==num[k][h])
								numRepetido=true;
						}
					}
				}while(numRepetido);
				num[i][j]=nuevoNumero;
			}
		}

		System.out.println();
		for (i = 0; i < num.length; i++){
		    for (j = 0; j < num[i].length; j++)
				System.out.print( num[i][j]  + "\t");
			System.out.println();
		}

		//buscando máximo e mínimo
		max=num[0][0];
		min=num[0][0];
		for(i=0;i<num.length;i++){
			for(j=0; j<num[i].length; j++){
				if(num[i][j]>max){
					max=num[i][j];
					posMaxColumna=j;
					posMaxFila=i;
				}
				if(num[i][j]<min){
					min=num[i][j];
					posMinColumna=j;
					posMinFila=i;
				}
			}
		}
		System.out.print("La posición del máximo es: "+posMaxColumna+", "+posMaxFila);
		System.out.print("\nLa posición del mínimo es: "+posMinColumna+", "+posMinFila);
	}
}