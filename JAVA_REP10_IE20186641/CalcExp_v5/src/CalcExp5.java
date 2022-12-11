import java.util.*;

public class CalcExp5 {

    static Vector<Integer> printEQ(Vector<Double> v, Vector<String> op) {
        Vector<Integer> muldiv = new Vector<Integer>();

        System.out.print(v.get(0) + " ");
        for (int x = 0; x < op.size(); x++) {
            double n = v.get(x + 1);
            String s = op.get(x);
            System.out.print(s + " " + n + " ");
            if ((s.compareTo("*") == 0) || (s.compareTo("/") == 0)) {
                muldiv.add(x);
            }
        }
        System.out.println("");
        return muldiv;
    }

    public static void main(String[] args) {
        int cnt = 0, cnt_op = 0, i;
        double num, sum = 0;
        Vector<Double> v = new Vector<Double>();
        Vector<String> op = new Vector<String>();
        Vector<Integer> muldivIndex = new Vector<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("수식을 입력하시오 ");
        String exp0 = scanner.nextLine();

        System.out.println("[1] 숫자 벡터 저장");
        StringTokenizer st = new StringTokenizer(exp0, "+-*/");

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            s = s.trim();
            op.add(s);
        }
        System.out.print("   step = " + 0 + " : ");
        muldivIndex = printEQ(v, op);
    }

}
