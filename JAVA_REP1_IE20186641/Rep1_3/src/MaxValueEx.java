import java.util.Scanner;

public class MaxValueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z, max = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1 입력: ");
		x = scan.nextInt();
		System.out.print("정수 2 입력: ");
		y = scan.nextInt();
		System.out.print("정수 3 입력: ");
		z = scan.nextInt();
		
		if(x > y && x > z)
			max = x;
		else if(y > x && y > z)
			max = y;
		else
			max = z;
		
		
		System.out.printf("%d, %d, %d 중에 가장 큰 수는 %d입니다.", x, y, z, max);
		scan.close();
	}

}
