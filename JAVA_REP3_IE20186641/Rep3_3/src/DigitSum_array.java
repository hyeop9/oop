import java.util.Scanner;

public class DigitSum_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = scanner.nextInt();
		
		int i, sum=0, n_digit = 0;
		int digit, tmpN, s, exp10;
		
		tmpN = num;
		while(tmpN > 0) {
			tmpN = tmpN/10;
			n_digit++;
		}
		
		// System.out.printf("%d의 자리수는 %d입니다 \n", num, n_digit);
	
		int intArray[] = new int[n_digit];
		
		tmpN = num;
		for(i=0; i <=n_digit-1; i++) {
			digit = tmpN % 10;
			sum = sum + digit;
			tmpN = tmpN/10;
			intArray[i] = digit;
		}
		System.out.printf("\n%d의 자리수는 %d이고 각 자리의 합은 %d 입니다 \n\n", num, n_digit, sum);
		

		s = 0;
		exp10 = 1;
		for(i=0; i <=n_digit-1; i++) {
			s = s + ((intArray[i]+1) % 10) * exp10 ;
			exp10 = exp10 * 10;
			System.out.printf("입력한 숫자 : ary[%d] = %d -> 자리값 1 증가 => %10d\n", i, intArray[i], s);
		}
		System.out.printf("\n 입력한 숫자 : %d -> 자리값 1 증가 => %d \n", num, s);
				
	}

}
