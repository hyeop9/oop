
public class TestWhile {

	public static void main(String[] args) {
		
		int x=1, sum=0;
		
		while(x<=10) {
			System.out.printf("\tbefore sum = %d\n", sum);
			sum += x;
			x++;
			System.out.printf("\tafter sum = %d\n\n", sum);
						
		}
		System.out.printf("sum = %d\n", sum);

	}

}
