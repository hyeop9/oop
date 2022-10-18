import java.util.Scanner;

class StudentGrade {
	String name;
	int stNumber;
	int score[];
	double avg;

	StudentGrade() {
		name = "홍길동";
		stNumber = 00000000;
		score = new int[10];
	}

	StudentGrade(String str, int num, int N) {
		name = str;
		stNumber = num;
		score = new int[N];
		for (int i = 0; i < score.length; i++) {
			score[i] = 0;
		}
	}

	void inputScore() {
		System.out.printf("< %s (%d) >\n", name, stNumber);
		System.out.printf("%d개의 과목의 점수를 입력하시오 \n", score.length);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.printf("[%d] = ", i+1);
			score[i] = sc.nextInt();
		}
	}

	void average() {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = sum / (double) score.length;
	}
}

public class StudentGradeEx1 {

	public static void main(String[] args) {

		StudentGrade Obj_St1 = new StudentGrade("김희원", 20190121, 5);
		Obj_St1.inputScore();
		Obj_St1.average();
		System.out.printf("%s의 평균은 %.1f입니다\n\n", Obj_St1.name, Obj_St1.avg);

		StudentGrade Obj_St2 = new StudentGrade();
		Obj_St2.inputScore();
		Obj_St2.average();
		System.out.printf("%s의 평균은 %.1f입니다\n\n", Obj_St2.name, Obj_St2.avg);
	}

}
