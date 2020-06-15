import java.util.*;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextInt();
        long pre = input.nextInt();
        long ans = 0;

        for (int i = 1; i < n; i++) {
            long nxt = input.nextLong();

            if (pre > nxt) {
                ans += pre - nxt;
            } else {
                pre = nxt;
            }
        }

        input.close();

        System.out.println(ans);
    }
}