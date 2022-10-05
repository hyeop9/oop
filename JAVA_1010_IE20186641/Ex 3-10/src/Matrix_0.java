
public class Matrix_0 {

	public static void main(String[] args) {
		
		int mat[][] = new int[9][9];
		int row = 9, col = 9, r, c;
		
		for(r=0; r<row; r++)
			for (c=0; c<col; c++) 
				//mat[r][c] = (r+1)*(c+1);
				mat[r][c] = (int)(Math.random()*10 + 1);
			
		System.out.println();
		System.out.println("생성한 9x9 Matrix");
		
		for(r=0; r<row; r++) {
			for (c=0; c<col; c++)
				System.out.printf("%3d ", mat[r][c]);
			System.out.println();
		
		}	
	}
}
