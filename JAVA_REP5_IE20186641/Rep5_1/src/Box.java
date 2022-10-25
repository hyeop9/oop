
public class Box {

	int width, height; // 박스의 너비와 높이
	char fillChar; // 박스를 그리는 데 사용하는 문자

	public Box() {	// 매개 변수 없는 생성자
					// this() 이용
	}

	public Box(int width, int height) {	// 너비와 높이의 2 매개 변수를 가진 생성자
		this.width = width;
		this.height = height;
	}

	public void draw() { // 박스 그리는 메소드

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print(fillChar);
			}
			System.out.println();
		}
	}

	public void fill(char c) {	// 박스를 그리는데 사용하는 문자 설정
		this.fillChar = c;
	}

	public static void main(String[] args) {

		System.out.println("객체 1 -------------------");

		Box a = new Box(10, 1);
		a.fill('X');
		a.draw();

		System.out.println();
		System.out.println("객체 2 -------------------");

		Box b = new Box(20, 10);
		b.fill('#');
		b.draw();
	}

}
