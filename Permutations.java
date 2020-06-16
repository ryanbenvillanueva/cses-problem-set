import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuilder o = new StringBuilder("");
        StringBuilder e = new StringBuilder("");
        input.close();

        if (n == 1) {
            System.out.println(n);
        }

        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                e.append(i + " ");
            } else {
                o.append(i + " ");
            }
        }

        System.out.println(e.append(o));
    }
}
