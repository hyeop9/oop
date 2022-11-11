import java.util.*;

public class CalcExp3 {

    public static void main(String[] args) {
        int cnt = 0, cnt_op = 0, i;
        Vector<Integer> v = new Vector<Integer>();
        Vector<String> op = new Vector<String>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("수식을 입력하시오 (숫자와 연산자는 공백으로 분리) ");
        String exp = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(exp, " ");

        int sum = 0, num = 0, num_check;
        String opr;

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            System.out.println("현재 분리된 string : " + s);
            s = s.trim();

            try {
                num = Integer.parseInt(s);
                v.add(num);
            } catch (NumberFormatException e) {
                op.add(s);
            }
        }

        System.out.print("\n입력한 계산식은 ");
        for (i = 0; i < op.size(); i++) {
            int n = v.get(i);
            String s = op.get(i);
            System.out.print(n + s);
        }
        System.out.println(v.lastElement() + " 입니다");

        sum = v.get(0);
        for (i = 0; i < op.size(); i++) {
        	String s = op.get(i);
            int n = v.get(i + 1);

            if (s.compareTo("+") == 0) {
                sum += n;
            } else if (s.compareTo("-") == 0){
                sum -= n;
            }
        }
        System.out.println("입력한 계산식의 결과는 " + sum + "입니다");
    }
}
