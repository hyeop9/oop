import java.util.*;

public class ExVectorDigitSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();

        int i, sum = 0;
        int digit, N, newNum = 0;

        Vector<Integer> v = new Vector<Integer>();

        N = num;
        i = 1;
        while (N != 0) {
            v.add(N%10);
            N /= 10;
        }
        System.out.println(v);

        // int exp10 = v.lastElement();

        for (i = 0; i < v.size(); i++) {
            sum += v.get(i);
            newNum = v.get(i) * 10;
            System.out.println(v.get(i));            
        }

        System.out.printf("\n%d의 자리수는 %d이고 각 자히의 합은 %d 입니다 \n\n", num, v.size(), sum);
        System.out.printf("입력한 숫자  : %d -> 자리값 교환  => %10d \n", num, newNum);
        scanner.close();
    }

}
