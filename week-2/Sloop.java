/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sloop {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int M, S;
        Boolean flag = true;
        int count = 0;

        for (int i = 0; i < T; i++) {
            M = sc.nextInt();
            S = sc.nextInt();
            System.out.println(M/S);
        }
    }
}
