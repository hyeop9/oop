
public class TestLoop {

	public static void main(String[] args) {
		
		
		int x, sum = 0;
		
		for(x=1; x<=200; x++) {
			
			System.out.printf("%3d ", x);
			
			if(x % 10 == 0)
				System.out.println();
		}

	}

}
