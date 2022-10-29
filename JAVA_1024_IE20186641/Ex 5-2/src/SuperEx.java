class Point {
	private int x, y; // 한 점을 구성하는 x,y 좌표
	Point() {
		this.x = 0;
		this.y = 0;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

// Point를 상속받은 ColorPoint 선언
class ColorPoint extends Point {
	private String color; // 점의 색

	ColorPoint(int x, int y, String color) {
		super(x, y); // Point의 생성자 point(x, y) 호출
		this.color = color;
	}

	void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point의 showPoint() 호출
	}
}

public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}
}
