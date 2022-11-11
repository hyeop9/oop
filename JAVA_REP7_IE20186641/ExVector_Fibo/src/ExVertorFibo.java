import java.util.*;

public class ExVertorFibo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int nMAX = scanner.nextInt();

        Vector<Integer> F = new Vector<Integer>();
        int i, newFibo;

        F.add(1); // 1, 2 초기화
        F.add(2);

        i = 1;
        while (F.get(i) < nMAX) {
            newFibo = F.get(i) + F.get(i - 1);
            F.add(newFibo);
            i++;
        }       

        F.remove(F.size() - 1); // while문의 조건에 따라 필요할 경우 벡터 후처리
        System.out.printf("\n%d이하의 피보나치 숫자중 마지막은 %d이고 다음과 같습니다. \n\n", nMAX, F.lastElement());

        for (int x = 0; x < F.size(); x++) {
            System.out.printf("F%-2d = %d\n", x + 1, F.get(x));
        }
        scanner.close();
    }

}
