import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수의 합 : ");
		
		System.out.print("정수값 1개를 입력하시오 : ");
		a = scan.nextInt();
		System.out.print("정수값 1개를 입력하시오 : ");
		b = scan.nextInt();
		
		c = a + b;
		
		System.out.println(a + " + " + b + " = " + c );
		System.out.printf("%d + %d = %x \n", a, b, c);
		
		System.out.print("정수값 2개를 입력하시오 : ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = a + b;
		System.out.println(a + " + " + b + " = " + c );
		scan.close();

	}

}
