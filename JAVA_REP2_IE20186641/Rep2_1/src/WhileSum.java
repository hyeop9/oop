
public class WhileSum {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		while(i < 999) {
			i++;
			if((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
			}
		}
		System.out.printf("1000보다 작은 3의 배수 또는 5의 배수의 합은 %d입니다.", sum);

	}

}
