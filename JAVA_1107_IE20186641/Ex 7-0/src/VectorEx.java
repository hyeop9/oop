import java.util.Scanner;

public class VectorEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int tmp, x = 0;
		int intArray[] = new int[3];

//		System.out.println("===========================");
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.print("양의 정수를 입력하세요 : ");
//			intArray[i] = scanner.nextInt();	// 키보드에서 입력받은 정수 저장
//		}

		System.out.println("===========================");
		while (true) {
			System.out.print("정수를 입력하세요 : (음수 입력시 종료)");
			tmp = scanner.nextInt();
			if (tmp > 0) {
				intArray[x] = tmp;
				x++;
			} else {
				System.out.println("음수를 입력하였습니다 : ");
				break;
			}
		}
	}

}
