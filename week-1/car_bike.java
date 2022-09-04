/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;

		for (int i = 0; i < T; i++) {
			Boolean flag = true;
			N = sc.nextInt();
			for (int j = 2; j <= N / 2; j++) {
				if (N % j == 0) {
					flag = false;
					break;
				}
			}
			if (N == 1) {
				System.out.println("no");
				continue;
			}
			if (N == 2) {
				System.out.println("yes");
				continue;
			}
			if (flag == false) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}

		}
	}
}
