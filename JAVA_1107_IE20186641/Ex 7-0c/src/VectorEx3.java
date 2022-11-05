import java.util.Scanner;
import java.util.Vector;

public class VectorEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tmp, x = 0, sum = 0;

        // 정수 값을 다루는 제네릭 벡터 생성
        Vector<Integer> v = new Vector<Integer>();

        while (true) {
            System.out.print("정수를 입력하세요 : (음수 입력시 종료)");
            tmp = scanner.nextInt();

            if (tmp > 0) {
                v.add(tmp);
            } else {
                break;
            }
        }

        for (int i = 0; i < v.size(); i++) {    // 모든 요소 정수 출력하기
            int n = v.get(i);                   // 벡터의 i 번째 정수
            System.out.println(n);
        }

        for (int i = 0; i < v.size(); i++) {    // 벡터 속의 모든 정수 더하기
            int n = v.elementAt(i);             // 벡터의 i 번째 정수
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
