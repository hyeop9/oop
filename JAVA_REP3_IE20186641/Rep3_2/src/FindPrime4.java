import java.util.Scanner;

public class FindPrime4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N, i, cnt=0, x;
		boolean is_prime = false;
		
		System.out.printf("찾고자 하는 소수의 갯수를 입력하시오: ");
		int nMAX = scanner.nextInt();
		int prime_ary[] = new int[nMAX];
		
		N = 2;
		while (cnt < nMAX) {
			
			is_prime = false;
			
			for(x=2; x<N/2+1; x++) {
				
				if(N%x==0) {
					is_prime = true;
					break;
				}
			}
			
			if (is_prime == false) {
				prime_ary[cnt] = N;
				cnt++;
			}
			N++;
		}
		
		System.out.printf("\n%d번째 소수는 %d입니다.\n", nMAX, N-1);
		System.out.printf("배열에 저장한 %d개의 소수는 다음과 같습니다.\n\n", nMAX);
		
		for (x=0; x<prime_ary.length; x++) {
			System.out.printf("prime_ary[%d] = %d\n", x, prime_ary[x]);
		}
		
		System.out.printf("\n프로그램 종료 \n");

	}

}
