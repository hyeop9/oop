import java.util.Scanner;

public class LeapYearEx {

	public static void main(String[] args) {
		
		int year= 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도를 입력하시오: ");
		year = scan.nextInt();
		
		if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
			System.out.printf("%d년은 윤년입니다.", year);
		else
			System.out.printf("%d년은 윤년이 아닙니다.", year);
		
		scan.close();

	}

}
