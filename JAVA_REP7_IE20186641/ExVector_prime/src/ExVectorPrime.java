import java.util.Scanner;
import java.util.Vector;

public class ExVectorPrime {

    public static boolean is_prime(int num) {

        for (int i = 2; i < (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("양의 정수를 입력하시오 : ");
        int nMAX = scanner.nextInt();

        Vector<Integer> prime = new Vector<Integer>();

        for (int x = 2; x < nMAX; x++) {

            if (is_prime(x) == true) {
                prime.add(x);
            }
        }

        System.out.printf("\n%d이하의 소수는 %d개이고 다음과 같습니다\n\n", nMAX, prime.size());

        for (int x = 0; x < prime.size(); x++) {
            System.out.printf("%4d ", prime.get(x));
            if ((x + 1) % 10 == 0) {
                System.out.println();
            }
            scanner.close();
        }
    }

}
