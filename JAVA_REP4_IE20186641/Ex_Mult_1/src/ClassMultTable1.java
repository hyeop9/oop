import java.util.Scanner;

public class ClassMultTable1 {

	public static void print_line(int col) {
		System.out.printf("+----+");
		for (int i = 1; i <= col; i++) {
			System.out.printf("----");
		}
		System.out.println("+");
	}

	public static void print_number(int col) {
		System.out.printf("|    |");
		for (int i = 1; i <= col; i++) 
			System.out.printf("%3d ", i);
		System.out.println("|");
	}

	public static void main(String[] args) {

		int i, col, row;
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Row값을 입력하시오 : ");
		row = scanner.nextInt();
		System.out.printf("Col값을 입력하시오 : ");
		col = scanner.nextInt();

		print_line(col);
		print_number(col);
		print_line(col);

		for (i = 1; i <= row; i++) {
			System.out.printf("|%3d |", i);
			for (int j = 1; j <= col; j++)
				System.out.printf("%3d ", i * j);
			System.out.println("|");
		}
		print_line(col);
	}

}
