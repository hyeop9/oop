import java.util.Scanner;

public class FindPrimeFunc2 {
	
	public static boolean isPrime(int N) {
		
		for(int x=2; x < (int)(Math.sqrt(N)+1); x++) {
			
			if (N % x==0)
				return false;
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		
		int N, i, cnt, x, num;
		
		System.out.print("소수 N개 구하기, 자연수 N을 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		
		int[] pAry = new int[N];
		
		num = 2;
		cnt = 0;
		while(cnt < N) {
			
			if (isPrime(num) == true) {
				pAry[cnt] = num;
				cnt++;
			}
			num++;
		}
		
		System.out.printf("\n2부터 %d개의 소수 : \n\n", N);
		
		for(x=0; x<N; x++) {
			System.out.printf("%4d ", pAry[x]);
			if( (x+1)%10 == 0)
				System.out.println();
			
			if( (x+1)%100 == 0)
				System.out.println();
		}
		
		
		scanner.close();

	}

}
