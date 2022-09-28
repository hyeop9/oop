import java.util.Scanner;

public class CheckPrime1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N, x;
		
		System.out.print("양의 정수를 입력하시오 : ");
		N = scanner.nextInt();
		
		for (x=2; x<N; x++) {
			if (N%x==0) {
				System.out.printf("%d는 소수가 아닙니다\n", N);
				break;
			}
		}
		scanner.close();
	}

}
