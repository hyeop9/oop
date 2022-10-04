
public class ForSum {

	public static void main(String[] args) {
		
		int i;
		long sum =0 ,sum1 =0, sum2 =0;
		
		// 제곱의 합 
		for(i=1; i<501;i++)
			sum1 = sum1 + i*i;
		
		System.out.println(sum1);
		
		// 합의 제곱
		for(i=1; i<501;i++)
			sum = sum + i;
			sum2 = sum*sum;
		System.out.println(sum2);
		
		System.out.printf("1부터 500까지 자연수에 대해 \"합의 제곱\"과 \"제곱의 합\"의 차이는 %d입니다.\n", sum2-sum1);
		
	}
	

}
