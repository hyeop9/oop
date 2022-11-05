import java.util.Random;
import java.util.Scanner;

public class Lotto_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int lotto[] = new int[7];
		int mylotto[] = new int[6];
		int result[] = new int[6];
		int cnt, i, win, j, tmp;
		int gen_count = 0;
		int ok_generation;

		// 로또 번호 선택
		while (gen_count < 6) {
			ok_generation = 1;
			System.out.printf("[%d] 1~45사이의 수를 입력하시오 : ", gen_count + 1);
			tmp = scan.nextInt();

			for (i = 0; i < 6; i++) {
				if (tmp == mylotto[i]) {
					ok_generation = 0;
				}
			}

			if (ok_generation == 1) {
				mylotto[gen_count] = tmp;
				gen_count++;
			} 
			else 
				System.out.println("중복된 번호입니다. 다시 입력하세요");
		}

		// 로또 번호 출력
		System.out.print("당신이 선택한 번호는 ");
		for (i = 0; i < 6; i++) {
			System.out.print(mylotto[i] + " ");
		}
		System.out.println("입니다");

		// 당첨 번호 생성
		for (i = 0; i < 7; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (j = 0; j < i; j++) {
				if(lotto[i] == lotto[j])
					i--;
			}
		}

		// 당첨 번호 출력
		System.out.print("이번주 행운의 번호는 ");
		for (i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.printf(" + 보너스 번호 %d 입니다\n", lotto[6]);

		// 당첨 번호 추첨
		cnt = 0;
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				if (mylotto[i] == lotto[j]) {
					result[cnt] = mylotto[i];
					cnt++;
				}
			}
		}

		// 추첨 결과 출력
		System.out.printf("당첨 번호 갯수 : %d\n", cnt);
		if (cnt > 0) {
			System.out.print("당첨 번호는 ");
			for (i = 0; i < cnt; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println("입니다");
		}

		if (cnt == 6) {
			if (result[cnt] == lotto[i]) System.out.printf("이번주 로또 추첨 결과 1등입니다.\n");
			else System.out.printf("이번주 로또 추첨 결과 2등입니다.\n");
		}
		else if (cnt == 5)
			System.out.printf("이번주 로또 추첨 결과 3등입니다.\n");
		else if (cnt == 4)
			System.out.printf("이번주 로또 추첨 결과 4등입니다.\n");
		else if (cnt == 3)
			System.out.printf("이번주 로또 추첨 결과 5등입니다.\n");
		else
			System.out.print("이번주 로또 추첨 결과 꽝입니다.\n");
	}
}
