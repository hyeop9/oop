import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int NMAX;
		int n = 0, max = 0;
		
		System.out.printf("입력 받을 양수의 갯수를 정하시오: NMAX = ");
		NMAX = scanner.nextInt();
		
		int intArray[] = new int[NMAX];
		
		System.out.printf("양수 %d개를 입력하시오: ", NMAX);
		for (int i = 0; i<NMAX; i++) {
			intArray[i] = scanner.nextInt();
			
		}
		
		System.out.printf("1~%d 사이의 정수를 입력하시오: ", NMAX);
		n = scanner.nextInt();
		
		if (n>=1 && n <= NMAX)
			System.out.printf("%d번째 입력한 정수는 %d 입니다.\n", n, intArray[n-1]);
		else
			System.out.printf("%d번째 인력한 정수는 없습니다.\n", n);
		
		max = 0;
		System.out.print("\n입력한 정수는 ");
		for(int i=0; i<NMAX; i++) {
			System.out.print(intArray[i] + " ");
			if(intArray[i] > max)
				max = intArray[i];
		}
		System.out.println("이고 가장 큰 수는 " + max + "입니다.");
		scanner.close();

	}

}
