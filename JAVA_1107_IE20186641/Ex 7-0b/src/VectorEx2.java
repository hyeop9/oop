import java.util.Scanner;

public class VectorEx2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int tmp, x = 0;
		int intArray[] = new int[3];

		System.out.println("===========================");

		while (true) {
			System.out.print("정수를 입력하세요 : (음수 입력시 종료)");
			tmp = scanner.nextInt();

			if (tmp > 0) {
				try {
					intArray[x] = tmp;
					x++;
				} catch (ArrayIndexOutOfBoundsException e) {	// 객체 e에 예외 정보가 넘어옴
					System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다.");
					break;
				}
			} else {
				System.out.println("음수를 입력하였습니다 : ");
				break;
			}
		}
	}

}
