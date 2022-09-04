import java.util.*;

public class Degree_of_Polynomial {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int p = sc.nextInt();
                if (p != 0) {
                    count = j;
                }

            }
            System.out.println(count);
            // if(count>)

        }
    }
}
