package ex_loop;

public class TestLoop {

	public static void main(String[] args) {
		
		int x, sum = 0;
		
		System.out.printf("<1>===========================\n");
		
		for(x=1; x<=10; x++) {
			System.out.printf("테스트\n");
		}
		System.out.printf("종료\n");
		
		System.out.printf("<2>===========================\n");
		
		for(x=1; x<=10; x++) {
			System.out.printf("%d\n", x);
		}
		System.out.printf("종료\n");

	}

}
