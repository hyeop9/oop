import java.util.Scanner;

public class ClassMultTable4 {

	int COL, ROW;

	public ClassMultTable4(int r, int c) {
		ROW = r;
		COL = c;
	}

	public void print_line() {
		System.out.printf("+----+");
		for (int i = 1; i <= COL; i++) {
			System.out.printf("----");
		}
		System.out.println("+");
	}

	public void print_line(String str) {
		System.out.printf("|    |");
		for (int i = 1; i <= COL; i++)
			System.out.printf("%3d ", i);
		System.out.println("|");
	}

	public void makeTable() {
		// COL ++;
		print_line();
		print_line("number line");
		print_line();
		for (int i = 1; i < ROW; i++) {
			System.out.printf("|%3d |", i);
			for (int j = 1; j <= COL; j++)
				System.out.printf("%3d ", i * j);
			System.out.println("|");
		}
		print_line();
	}

	public static void main(String[] args) {

		int i, col, row;
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Row값을 입력하시오 : ");
		row = scanner.nextInt();
		System.out.printf("Col값을 입력하시오 : ");
		col = scanner.nextInt();

		ClassMultTable4 obj_table = new ClassMultTable4(row, col);
		obj_table.makeTable();

		ClassMultTable4 obj_9x9[] = new ClassMultTable4[10];

		for (i = 0; i < 10; i++) {
			System.out.printf("         < %d 단 >\n", i+1);
			obj_9x9[i] = new ClassMultTable4(i + 1, 9);
			obj_9x9[i].makeTable();
		}

	}
}
