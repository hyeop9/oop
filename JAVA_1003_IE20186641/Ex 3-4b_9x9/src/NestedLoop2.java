import java.util.Scanner;


public class NestedLoop2 {

	public static void main(String[] args) {
		
		int i, col, row;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Row값을 입력하시오: ");
		row = scanner.nextInt();
		System.out.printf("Col값을 입력하시오: ");
		col = scanner.nextInt();
		
		System.out.printf("+");
		for(i=1; i<=col; i++)
			System.out.printf("----");
		System.out.printf("+\n");
		
		for(i=1; i<=row; i++) {
			System.out.printf("|");
			for(int j=1; j<=col; j++)
				System.out.printf("%3d ", i*j);
			System.out.printf("|\n");
		}
		
		System.out.printf("+");
		for(i=1; i<=col; i++)
			System.out.printf("----");
		System.out.printf("+\n");
	}
}
