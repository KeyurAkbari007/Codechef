import java.util.*;

public class Mutated_Minions {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int count = 0;
            for (int j = 0; j < N; j++) {
                int p = sc.nextInt();
                if ((p + K) % 7 == 0)
                    count++;
            }
            System.out.println(count);
        }
    }
}
