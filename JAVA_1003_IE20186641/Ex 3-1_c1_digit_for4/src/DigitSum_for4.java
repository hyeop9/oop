import java.util.Scanner;

public class DigitSum_for4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("네자리 정수를 입력하세요: ");
		
		int num = scanner.nextInt();
		int i, sum = 0;
		int digit;
		
		for(i=1; i<4; i++) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
			
		}
		System.out.printf("sum = %d\n", sum);
		
	}
}
