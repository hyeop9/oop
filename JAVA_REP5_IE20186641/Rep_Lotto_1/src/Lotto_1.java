import java.util.Scanner;

public class Lotto_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int lotto[] = new int[6];
		int myLotto [] = new int[6];
		int n, i;

		// 로또 번호 선택, 배열에 저장 ==================
		for (i = 0; i < 6; i++) {
			System.out.printf("[%d] 1~45사이의 수를 입력하시오 : ", i + 1);
			myLotto[i] = scan.nextInt();
		}

		// 선택 번호 출력 ===============
		System.out.print("당신이 선택한 번호는");
		for (i = 0; i < 6; i++) {
			System.out.print(myLotto[i] + " ");
		}
		System.out.println("입니다");

		// 당첨 번호 생성, 배열에 저장 ===============
		for (i = 0; i < 6; i++) {
			lotto[i] = ((int) (Math.random()*45) +1);
		}

		// 당첨 번호 출력 ===================
		System.out.print("이번주 행운의 번호는");
		for (i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("입니다");
	}
}
