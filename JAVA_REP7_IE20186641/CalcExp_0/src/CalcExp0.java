import java.util.StringTokenizer;

public class CalcExp0 {

	public static void main(String[] args) {

		String query = "1 + 2 + 3 + 4";
		StringTokenizer st = new StringTokenizer(query, " ");

		int n = st.countTokens();
		System.out.println("토근 개수 = " + n);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			token = token.trim();

			System.out.println(token);
		}
	}
}