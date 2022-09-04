/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prime {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N;
        Boolean flag = false;

        for (int i = 0; i < T; i++) {
            N = sc.nextInt();
            intArray[i] = N;
        }
        int a;
        for (int i = 0; i < T; i++) {
            a = intArray[i];
            for (int j = 2; j <= a / 2; j++) {
                if (a % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}
