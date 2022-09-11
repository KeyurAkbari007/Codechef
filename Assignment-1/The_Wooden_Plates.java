/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*---Defenation---
You and your pal are playing a jumping game. There are NN wooden plates in a row (where NN is an odd number). You jump into plate 11, and your friend jumps into plate NN. Then you jump into plate 22, and your friend follows you into plate N-1N−1, and so on.

The procedure comes to an end when someone is unable to make the following jump because the plate is occupied by someone else. Locate the last plate to be jumped into.*/
/* Name of the class has to be "Main" only if the class is public. */
 class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double p = sc.nextInt();
            double plate = Math.ceil(p / 2);
            System.out.println((int) plate);
        }
    }
}