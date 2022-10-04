
public class NestedLoopEx {

	public static void main(String[] args) {

		int i, j;
		
		
		System.out.println("[loop-2]--------------------------------------");
		for(i=0; i<10; i++) {
			for(j=0; j<10; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		System.out.println("[loop-3]--------------------------------------");
		for(i=1; i<=10; i++) {
			for(j=1; j<=i; j++) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
		
		System.out.println("[loop-4]--------------------------------------");
		for(i=10; i>0; i--) {
			for(j=1; j<=i; j++) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
		
		System.out.println("[loop-5]--------------------------------------");
		for(i=1; i<=10; i++) {
			for(j=10; j>=i; j--) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}

	}

}
