import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long total = n * (n + 1) / 2;
        long sum = 0;
        for (int i = 1; i < n; i++) {
            int a = input.nextInt();
            sum += a;
        }

        input.close();

        System.out.println(total - sum);
    }
}