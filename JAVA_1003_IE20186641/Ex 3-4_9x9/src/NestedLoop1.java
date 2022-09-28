
public class NestedLoop1 {

	public static void main(String[] args) {
		
		System.out.printf("<1>===========================\n");
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i*j + "  ");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("<2>===========================\n");
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%2d ", i*j);
			}
			System.out.printf("\n");
		}
	}
}
