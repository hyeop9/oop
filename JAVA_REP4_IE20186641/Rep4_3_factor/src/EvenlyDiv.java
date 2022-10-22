import java.util.Scanner;

public class EvenlyDiv {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.printf("1부터 N사이의 어떤 수로도 나누어 떨어지는 가장 작은 수를 구하고자 한다\n");
		System.out.printf("N을 입력하시오 : ");
		int N = scanner.nextInt();

		int num = N;
		int count = 0, i;

		while (true) {
			count++;
			i = 0;
			for (int j = 1; j <= N; j++) {
				if (count % j == 0) {
					i++;
				}
			}
			if (i == N) {
				break;
			}
			num = count+1;
		}

		System.out.printf("1부터 %d사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 %d 입니다 \n", N, num);
	}
}
