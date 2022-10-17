
public class Fibo_2 {

	public static void main(String[] args) {
		
		int [] F = new int[100];
		int i = 1, j;
		int sum = 0;
		F[0] = 1;
		F[1] = 2;
		
		while(F[i] < 4000000) {
			i++;
			F[i] = F[i-1] + F[i-2];
			System.out.printf("F[%d] : %d\n", i, F[i]);
			
		}
		for(j=0; j<i; j++ ) {
			
			if(F[j]%2==0)
				sum += F[j];
		}
		System.out.printf("짝수이면서 4백만 이하인 모든 항의 합은 %d입니다 \n", sum);

	}

}
