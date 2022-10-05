
public class MakeArray {
	
	
	static int[] makeArray(int N) { // 일차원 정수 배열 리
		
		int temp[] = new int[N]; // 배열 생
		for(int i=0; i<temp.length; i++)
			temp[i] = i; // 배열 초기화, 0, 1, 2, 3
		return temp; // 배열 리턴
	}
	

	public static void main(String[] args) {
		
		int intArray[]; // 배열 레퍼런스 변수 선언
		
		intArray = makeArray(5); // 메소드가 리턴한 배열 참조
		System.out.print(intArray + " --> ");
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
		System.out.println();
		
		intArray = makeArray(10); // 메소드가 리턴한 배열 참조
		System.out.print(intArray + " --> ");
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
		System.out.println();
		
		intArray = makeArray(7); // 메소드가 리턴한 배열 참조
		System.out.print(intArray + " --> ");
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
		System.out.println();

	}

}
