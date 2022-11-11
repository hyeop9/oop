import java.util.*;

public class CalcExp1 {

	public static void main(String[] args) {
		int cnt = 0, i;

		Scanner scanner = new Scanner(System.in);
		System.out.print("덧셈식을 입력하시오 : ");
		String exp = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(exp, "+");
		int sum = 0;

		int n = st.countTokens();
		int Num[] = new int[n];

		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			s = s.trim();

			System.out.println("현재 분리된 string : " + s );
			Num[cnt] = Integer.parseInt(s);
			cnt++;
		}

		System.out.println("");
		System.out.print("입력한 숫자는 ");
		for (i = 0; i < Num.length; i++) {
			sum += Num[i];
		}
		System.out.println("입력한 덧셈식의 합은 " + sum + "입니다");
	}

}
