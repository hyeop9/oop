import java.util.Scanner;

class StudentGrade {
	private String name;
	private int stNumber;
	private int score[];
	private double avg;

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

	String getName() {
		return name;
	}
	int getStNumber() {
		return stNumber;
	}
	int[] getScore() {
		return score;
	}
	double getAvg() {
		return avg;
	}

}

class StudentGrade_sub extends StudentGrade {

	int max;

	StudentGrade_sub(String str, int num, int N) {
		super(str, num, N);
		max = 0;
	}

	int subScore[] = getScore();
	void findMax() {
		for (int i = 0; i < subScore.length; i++) {
			if (subScore[i] > max) {
				max = subScore[i];
			}
		}
	}
}

public class StudentGradeEx3 {

	public static void main(String[] args) {

		StudentGrade_sub Obj_St1 = new StudentGrade_sub("김희원", 20190121, 5);
		Obj_St1.inputScore();
		Obj_St1.findMax();
		Obj_St1.average();
		System.out.printf("%s의 평균은 %.1f이고 최고점수는 %d입니다\n\n",
				Obj_St1.getName(), Obj_St1.getAvg(), Obj_St1.max);
	}

}
