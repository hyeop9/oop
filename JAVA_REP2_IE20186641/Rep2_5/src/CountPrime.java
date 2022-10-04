
public class CountPrime {

	public static void main(String[] args) {
		
		int N, i, cnt=0, x;
		boolean is_prime;
		
		for(N=2; N<=1000; N++) { 
			
			is_prime = true;
			
			for(x=2; x<N/2+1; x++) {
				if(N % x ==0) {
					is_prime = false;
					System.out.printf("\t%3d는 %d로 나누어 지므로 소수가 아닙니다.\n", N, x);
					break;	
				}
			}
			if(is_prime == true) {
				cnt++;
				System.out.printf("%d는 %d번째 소수입니다.\n", N, cnt);
			}
		
	}
		System.out.printf("\n2부터 1000까지의 소수는 %d개 입니다.", cnt);

 }
	
}
