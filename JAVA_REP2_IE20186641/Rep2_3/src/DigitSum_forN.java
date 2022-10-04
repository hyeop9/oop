import java.util.Scanner;

public class DigitSum_forN {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("입력할 정수의 자리수를 정하시오 : ");
		int N = scanner.nextInt();
		
		System.out.printf("%d 자리수의 정수를 입력하세요: ", N);
		int num = scanner.nextInt();
		
		int digit = 0, sum = 0;
		int number = num;
		
		for(int i=1; i<=N; i++) {
			digit = num %10;
			sum = sum + digit;
			num = num/10;
		}
		System.out.printf("입력한 %d의 각 자리수의 합은 %d입니다.\n", number, sum);
		
	}

}
