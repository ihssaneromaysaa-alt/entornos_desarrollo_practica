public class Ej1{
	public static void main(String[] args) {
		//objetos y variables
		int[][] num=new int[3][6];
		
		//valores de array
		num[0][0]=0;
		num[0][1]=30;
		num[2][0]=2;
		num[0][2]=5;
		num[0][5]=5;
		num[1][0]=75;
		num[1][4]=0;
		num[2][2]=-2;
		num[2][3]=9;
		num[2][0]=11;
		
		for (int i = 0; i < num.length; i++){
	    	// length returns number of rows
		    for (int j = 0; j < num[i].length; j++){
				    // here length returns number of columns corresponding to current row
					// using tabs for equal spaces, looks better aligned
					// matrix[i][j] will return each element placed at row ‘i',column 'j'
					System.out.print( num[i][j]  + "\t");
			    	}
		    System.out.println();
		}
	}
}