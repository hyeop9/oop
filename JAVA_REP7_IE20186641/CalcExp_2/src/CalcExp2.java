import java.util.*;

public class CalcExp2 {

    public static void main(String[] args) {
        int cnt = 0, i, n;
        int sum = 0;

        Vector<Integer> v = new Vector<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("덧셈식을 입력하시오 : ");
        String exp = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(exp, "+");

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            s = s.trim();
            System.out.println("현재 분리된 string : " + s);
            n = Integer.parseInt(s);
            v.add(n);
        }

        System.out.print("\n입력한 숫자는 ");
        for (i = 0; i < v.size() - 1; i++) {
            n = v.get(1);
            System.out.println();
            sum += i;
        }
        System.out.println("입니다");

        System.out.println("입력한 덧셈의 합은 " + sum + "입니다");
    }

}
