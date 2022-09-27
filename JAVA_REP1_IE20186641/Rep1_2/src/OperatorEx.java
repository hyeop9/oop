
public class OperatorEx {

	public static void main(String[] args) {
		
		boolean c;
		int a = 1, b = 2;
		c = (a++ == 1) && (b++ == 2);
		System.out.println("[1] a = " + a + ", b = " + b + ", c = " +  c);

		c = (++a == 2) && (++b == 2);
		System.out.println("[2] a = " + a + ", b = " + b + ", c = " +  c);
		
		c = (a++ == 2) || (b++ == 3);
		System.out.println("[3] a = " + a + ", b = " + b + ", c = " +  c);
		
		c = (a++ == 4) || (b++ == 4);
		System.out.println("[4] a = " + a + ", b = " + b + ", c = " +  c);
	}

}
