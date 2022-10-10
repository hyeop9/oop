import java.util.Scanner;

public class Matrix_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		int row, col, r, c;
		
		System.out.print("row 값을 입력하시오 (1~9) : ");
		row = scan.nextInt();
		System.out.print("col 값을 입력하시오 (1~9) : ");
		col = scan.nextInt();
		
		int mat[][] = new int [row+1][col+1];
		for(r=0; r<row; r++) {
			for(c=0; c<col; c++) {
				mat[r][c] = (int)(Math.random()*10 + 1);
			}
		}
		
		System.out.println();
		System.out.println("생성한 Matrix");
		
		for(r=0; r<row; r++) {
			for(c=0; c<col; c++) {
				System.out.printf("%3d ", mat[r][c]);
			}
			System.out.println();
		}
		
		for(r=0; r<row; r++) {
			for(c=0; c<col; c++) {
				mat[row][col] = mat[row][col] + mat[r][c];
				mat[row][c] = mat[row][c] + mat[r][c];
				mat[r][col] = mat[r][col] + mat[r][c];
			}
		}
		
		System.out.println();
		System.out.println("각 행과 열의 덧셈 결과는 ...");
		
		for(r=0; r<=row; r++) {
			for(c=0; c<=col; c++) {
				System.out.printf("%3d ", mat[r][c]);
			}
			System.out.println();
		}
	}

}
