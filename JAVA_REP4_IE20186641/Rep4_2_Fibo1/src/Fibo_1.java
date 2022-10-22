
public class Fibo_1 {

	public static void main(String[] args) {
		
		int F_new, Fa, Fb, i;
		
		Fa = 1;
		Fb = 2;
		System.out.printf("F%d = %d\n", 1, 1);
		System.out.printf("F%d = %d\n", 2, 2);
		i = 2;
		
		while(i<10) {
			i++;
			F_new = Fa + Fb;
			Fa = Fb;
			Fb = F_new;
			System.out.printf("F%d = %d\n", i, F_new);
		}
	}
}