import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		
		System.out.print("학년을 입력하세요(1~4): ");
		int year = scanner.nextInt();
		
		
		if(score >= 60) {
			if(year != 4)
				System.out.print("합격");
			else if(score >= 70)
				System.out.print("합격");
			else
				System.out.print("불합격");
		}
		else
			System.out.print("불합격");
		
		scanner.close();
	}

}
