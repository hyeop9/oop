package ex_print;

public class PrintTest3 {

	public static void main(String[] args) {
		
		int num = 77;
		float pi = 3.14159F;
		String myString = "안녕하세요.";
		char myChar = 'c';
		
		System.out.print("Welcome to Java World!\n");
		System.out.printf("Welcome to Java World!\n");
		System.out.println("Welcome to Java World!");

		System.out.print("num : " + num + "\n");
		System.out.printf("num : " + num + "\n");
		System.out.println("num : " + num);
		
		System.out.println("Hello\tJava");
		System.out.println("Hello\nJava");
		System.out.println("Hello\'Java");
		System.out.println("Hello\"Java");
		System.out.println("Hello\\Java");
		
		System.out.printf("10진수 : %d\n", num);
		System.out.printf("8진수 : %o\n", num);
		System.out.printf("16진수 : %x\n", num);
		System.out.printf("16진수 : %X\n", num);
		System.out.printf("실수 : %f\n", pi);
		System.out.printf("실수 : %.4f\n", pi);
		System.out.printf("실수 : %e\n", pi);
		System.out.printf("실수 : %g\n", pi);
		System.out.printf("문자열 : %s\n", myString);
		System.out.printf("문자 : %c\n", myChar);
	}

}
