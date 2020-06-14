import java.util.*;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        input.close();

        System.out.print(n);

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }

            System.out.print(" " + n);
        }
    }
}