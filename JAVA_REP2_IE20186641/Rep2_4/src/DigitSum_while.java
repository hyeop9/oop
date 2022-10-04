import java.util.Scanner;

public class DigitSum_while {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = scanner.nextInt();
		
		int sum=0, digit_cnt = 0;
		int digit = 0, n;
		n = num;
		
		while(n>0) {
			digit_cnt++;
			digit = n %10;
			sum = sum + digit;
			n = n/10;
		}

		System.out.printf("%d의 자리수는 %d입니다.\n", num, digit_cnt);
		System.out.printf("입력한 %d의 각 자리수의 합은 %d입니다.\n", num, sum);
		scanner.close();
	}

}
