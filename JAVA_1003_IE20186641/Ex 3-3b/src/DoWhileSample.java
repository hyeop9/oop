import java.util.Scanner;

public class DoWhileSample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int count = 0, n = 0;
		double sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		
		do {
			n = scanner.nextInt();
			sum = sum +n;
			count++;
		}
		while(n != 0);
		
		count--;
		
		System.out.print("수의 개수는 " + count + "개이며");
		System.out.print("평균은 " + sum/count + "입니다.");
		scanner.close();

	}

}