import java.util.*;

public class CalcExp4 {

	public static void main(String[] args) {
		int cnt = 0, cot_op = 0, i, sum, num;
		Vector<Integer> v = new Vector<Integer>();
		Vector<String> op = new Vector<String>();

		Scanner scanner = new Scanner(System.in);
		System.out.print("수식을 입력하시오 ");
		String exp0 = scanner.nextLine();

		System.out.println("[1] 숫자 벡터 저장");
		StringTokenizer st = new StringTokenizer(exp0, "+-*/");

		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println("현재 분리된 string : " + s);
			s.trim();
			
			try {
				num = Integer.parseInt(s);
				v.add(num);
			} catch (NumberFormatException e) {
				continue;
			}
		}

		System.out.println("[2] 연산자 벡터 저장");
		st = new StringTokenizer(exp0, "0123456789");

		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println("현재 분리된 string : " + s);
			s.trim();

			op.add(s);

//			try {
//				num = Integer.parseInt(s);
//				v.add(num);
//			} catch (NumberFormatException e) {
//				continue;
//			}
		}



		System.out.printf("\n입력한 계산식은 %s", v.get(0));
		for (i = 0; i < op.size(); i++) {
			String s = op.get(i);
			int n = v.get(i+1);
			System.out.print(s + " " + n + " ");
		}
		System.out.println("입니다");
	}

}
