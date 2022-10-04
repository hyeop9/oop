// 시험문제 (숫자만 바꿔서)

public class OperatorEx {

	public static void main(String[] args) {
		
		boolean c;
		int a = 1, b = 2;
		c = (a++ == 1) && (b++ == 2); // 비교:T 후 a->2,  비교:T 후 b->3
		System.out.println("[1] a = " + a + ", b = " + b + ", c = " +  c);

		c = (++a == 2) && (++b == 2); // a->3 후 비교:F, b는 실행 안해서 그대로 b == 3
		System.out.println("[2] a = " + a + ", b = " + b + ", c = " +  c);
		
		c = (a++ == 2) || (b++ == 3); // 비교: F 후 a->4, 비교:T  b->4  
		System.out.println("[3] a = " + a + ", b = " + b + ", c = " +  c);
		
		c = (a++ == 4) || (b++ == 4); // 비교: T 후 a->5, b는 실행 안해서 그대로 b == 4 
		System.out.println("[4] a = " + a + ", b = " + b + ", c = " +  c);
	}

}
