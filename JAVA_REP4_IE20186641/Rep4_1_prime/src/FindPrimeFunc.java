import java.util.Scanner;

public class FindPrimeFunc {
	
	public static boolean isPrime(int N) {

		boolean isPrime = true;
		for (int x=2; x<N/2+1; x++) {
			if (N%x==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		int N, i, cnt=0, x;

		for(N=2; N<=1000; N++) {
			
			if(isPrime(N) == true) {
				cnt++;
				System.out.printf("%3d는 %3d번째 소수입니다\n", N, cnt);
			}
		}
		
		System.out.printf("\n2부터 1000까지의 소수는 %d개 입니다\n", cnt);
	}
}
