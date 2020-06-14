import java.util.*;

public class Repetitions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();
        char[] letters = s.toCharArray();
        int ans = 1, cnt = 0;
        char l = 'A';

        for (char d : letters) {
            if (d == l) {
                cnt++;
                ans = Math.max(ans, cnt);
            } else {
                l = d;
                cnt = 1;
            }
        }

        System.out.println(ans);
    }
}