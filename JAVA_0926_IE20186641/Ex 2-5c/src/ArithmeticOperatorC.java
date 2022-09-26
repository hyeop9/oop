import java.util.Scanner;

public class ArithmeticOperatorC {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("네자리 정수를 입력하세요: ");
		int num = scanner.nextInt();
		int digit, sum = 0, tmp;
		tmp = num;
		
		digit = num % 10;
		sum = sum + digit;
		num = num / 10;

		digit = num % 10;
		sum = sum + digit;
		num = num / 10;

		digit = num % 10;
		sum = sum + digit;
		num = num / 10;

		digit = num % 10;
		sum = sum + digit;
		num = num / 10;

		System.out.printf("입력한 %d의 각 자리수의 합은 %d입니다. \n", tmp, sum);
		scanner.close();
	}

}
