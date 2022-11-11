import java.util.Random;
import java.util.Scanner;

public class Lotto_4_v1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        int lotto[] = new int[7];
//        int mylotto[] = new int[6];
//        int result[] = new int[6];
        int cnt, i, win, j, tmp;
        int gen_count = 0;
        int ok_generation;
        String reGame;

        do {
        	int lotto[] = new int[7];
            int mylotto[] = new int[6];
            int result[] = new int[6];
        	cnt = 0; 
            gen_count = 0;
            ok_generation = 0;

            // 로또 번호 선택
            while (gen_count < 6) {
                ok_generation = 1;
                System.out.printf("[%d] 1~45사이의 수를 입력하시오 : ", gen_count + 1);
                tmp = scan.nextInt();

                for (i = 0; i < 6; i++) {
                    if (tmp == mylotto[i]) {
                        ok_generation = 0;
                    }
                    if (tmp > 45 || tmp < 1) {
                        ok_generation = -1;
                    }
                }

                if (ok_generation == 1) {
                    mylotto[gen_count] = tmp;
                    gen_count++;
                } else if (ok_generation == 0) {
                    System.out.println("중복된 번호입니다. 다시 입력하세요");
                } else {
                    System.out.println("1~45사이의 수가 아닙니다. 다시 입력하세요");
                }
            }

            // 로또 번호 출력
            System.out.print("당신이 선택한 번호는 ");
            for (i = 0; i < 6; i++) {
                System.out.print(mylotto[i] + " ");
            }
            System.out.println("입니다");

            // 당첨 번호 생성
            gen_count = 0;
            while (gen_count < 7) {
                ok_generation = 1;
                tmp = (int) (Math.random() * 45 + 1);

                for (i = 0; i < 6; i++) {
                    if (tmp == lotto[i]) {
                        ok_generation = 0;
                    }
                }
                if (ok_generation == 1) {
                    lotto[gen_count] = tmp;
                    gen_count++;
                } else {
                    System.out.println();
                }
            }

            // 당첨 번호 출력
            System.out.print("이번주 행운의 번호는 ");
            for (i = 0; i < 6; i++) {
                System.out.print(lotto[i] + " ");
            }
            System.out.println(" + 보너스 번호" + lotto[6] + " 입니다");

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

            int BONUS_count = 0;

            if (cnt == 5) {
                for (i = 0; i < 6; i++) {
                    if (mylotto[i] == lotto[6]) {
                        BONUS_count = 1;
                        result[5] = lotto[6];
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
                if (BONUS_count == 0) {
                    System.out.printf("이번주 로또 추첨 결과 1등입니다.\n");
                } else {
                    System.out.printf("이번주 로또 추첨 결과 2등입니다.\n");
                }
            } else if (cnt == 5) {
                System.out.printf("이번주 로또 추첨 결과 3등입니다.\n");
            } else if (cnt == 4) {
                System.out.printf("이번주 로또 추첨 결과 4등입니다.\n");
            } else if (cnt == 3) {
                System.out.printf("이번주 로또 추첨 결과 5등입니다.\n");
            } else {
                System.out.print("이번주 로또 추첨 결과 꽝입니다.\n");
            }

            System.out.printf("\n게임을 다시 시작하시겠습니다? (yes or no) : ");
            reGame = scan.next();
            System.out.print("\n");
        } while (reGame.compareTo("yes") == 0);
        System.out.print("\n로또 게임을 종료하였습니다.\n");
    }
}
