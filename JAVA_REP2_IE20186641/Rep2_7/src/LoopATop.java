import java.util.Scanner;

public class LoopATop {

	public static void main(String[] args) {
		
		int N, j, i;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("층수를 입력하시오 : ");
		N = scanner.nextInt();
		
		for(i=1; i<=N; i++) {
			
			for(j=1; j<=N-i; j++)
				System.out.print(" ");
			
			
			for(j=1; j<=2*i-1; j++)
				System.out.print("A");
			
			System.out.println("");
		}

	}

}
