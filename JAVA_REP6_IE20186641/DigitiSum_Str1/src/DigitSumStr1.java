import java.util.*;

public class DigitSumStr1 {

	public static void main(String[] args) {

		int cnt = 0, i, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		String num_str = scanner.next();

		for (i = 0; i < num_str.length(); i++) {

			String s = num_str.substring(i, i + 1);
			sum += Integer.parseInt(s);
			System.out.print(s + " ");
			cnt++;
		}

		System.out.println("");
		System.out.printf("입력한 숫자의 자리수는 %d 이고 합은 %d 입니다\n", cnt, sum);
		scanner.close();
	}

}
