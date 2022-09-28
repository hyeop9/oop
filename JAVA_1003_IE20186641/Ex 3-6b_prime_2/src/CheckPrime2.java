import java.util.Scanner;

public class CheckPrime2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N, x;
		boolean is_prime;
		
		is_prime = true;
		
		System.out.print("양의 정수를 입력하시오 : ");
		N = scanner.nextInt();
		
		for (x=2; x<N/2+1; x++) {
			if (N%x==0) {
				is_prime = false;
				break;
			}
		}
		
		if (is_prime == true)
			System.out.printf("%d는 소수입니다\n", N);
		else
			System.out.printf("%d는 소수가 아닙니다\n", N);
		
		scanner.close();
	}

}
