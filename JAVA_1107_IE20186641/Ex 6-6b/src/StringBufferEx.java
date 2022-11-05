
public class StringBufferEx {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println("sb 버퍼의 크기 = " + sb.capacity());
		System.out.println("sb의 hashcode = " + sb.hashCode() + "\n");

		sb = new StringBuffer("This");
		System.out.println("sb 버퍼의 크기 = " + sb.capacity());
		System.out.println("sb의 hashcode = " + sb.hashCode() + "\n");

		System.out.println(sb);
		System.out.println("0123456789 --------- sb 문자열 갯수 : " + sb.length() + "\n");

		sb.append(" is pencil");	// 문자열 덧붙이기
		System.out.println(sb);
		System.out.println("0123456789 --------- sb 문자열 갯수 : " + sb.length() + "\n");

		sb.insert(7, " my");	// 문자열 삽입
		System.out.println(sb);
		System.out.println("0123456789 --------- sb 문자열 갯수 : " + sb.length() + "\n");

		sb.replace(8, 10, "your");	// 문자열 대치
		System.out.println(sb);
		System.out.println("0123456789 --------- sb 문자열 갯수 : " + sb.length() + "\n");

		sb.setLength(5);	// 스트링 버퍼 내 문자열 길이 설정
		System.out.println(sb);
		System.out.println("0123456789 --------- sb 문자열 갯수 : " + sb.length() + "\n");

		System.out.println("sb 버퍼의 크기 = " + sb.capacity());
		System.out.println("sb의 hashcode = " + sb.hashCode());
	}

}
