public class ArrayAccess2 {

	static int sum(int x[]) {
		int n, s=0;
		System.out.println(x);
		for(n=0; n<x.length; n++)
			s += x[n];
		// x[2] = 100;
		return s;
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[] = a;
		int c[] = {10,20,30,40,50,60,70,80};
		
		int n = sum(a); // n = 15;
		System.out.println(n);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("a[1], b[1] ================ ");
		a[1] = 10; // {1, 10, 3, 4, 5}
		
		System.out.println(a[1]);
		System.out.println(b[1]);
		System.out.println("a[2], b[2], c[2] ================ ");
		System.out.println(a[2]);
		System.out.println(b[2]);
		System.out.println(c[2]);
		System.out.println("length =================");
		System.out.printf("length of a = %d\n", a.length);
		System.out.printf("length of b = %d\n", b.length);
		System.out.printf("length of c = %d\n", c.length);

		c = a;
		System.out.println(c[2]);
		
		System.out.printf("length of a = %d\n", a.length);
		System.out.printf("length of b = %d\n", b.length);
		System.out.printf("length of c = %d\n", c.length);

	}

}
