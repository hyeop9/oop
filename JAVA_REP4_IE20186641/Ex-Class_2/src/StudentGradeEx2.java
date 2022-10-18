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

class StudentGrade_sub extends StudentGrade {

	int max;

	StudentGrade_sub(String str, int num, int N) {
		super(str, num, N);
		max = 0;
	}

	void findMax() {
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}
	}
}

public class StudentGradeEx2 {

	public static void main(String[] args) {

		StudentGrade_sub Obj_St1 = new StudentGrade_sub("김희원", 20190121, 5);
		Obj_St1.inputScore();
		Obj_St1.findMax();
		Obj_St1.average();
		System.out.printf("%s의 평균은 %.1f이고 최고점수는 %d입니다\n\n", Obj_St1.name, Obj_St1.avg, Obj_St1.max);
	}

}
