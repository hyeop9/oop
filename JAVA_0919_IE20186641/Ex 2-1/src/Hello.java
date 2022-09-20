public class Hello {
	
	public static int sum(int n, int m) {
		return n + m;
	}

	public static void main(String[] args) {
		
		int i = 20;
		int s = 10, n = 0;
		double d = 100000000000000.0;
		d = d + 5;
		System.out.printf("%20.0f \n", d);
		System.out.println(d);
		char a = 'A';
		
		n = sum(i, 10);
		System.out.println(n);
		System.out.println(s + "\n");
		
		System.out.println(a);
		System.out.println(a + 1);
		System.out.println((char)(a+1));
		System.out.println(a + '1');
		System.out.println(a + "1" + "\n");
		
		System.out.println("Hello ");
		System.out.println("Hello " + 10);
		System.out.println("Hello " + a + "\n");
		
		System.out.println(s);
		System.out.println(s + a);
		System.out.println(s + 'a');
		System.out.println(s + "a");

	}

}
