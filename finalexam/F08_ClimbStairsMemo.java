package finalexam;

import java.util.Scanner;

public class F08_ClimbStairsMemo {

    static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入 n: ");
        int n = sc.nextInt();

        memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }

        int ways = climbStairs(n);
        System.out.println("Ways: " + ways);
    }

    public static int climbStairs(int n) {

        if (n < 0) return 0;
        if (n == 0) return 1;

        if (memo[n] != -1) return memo[n];

        memo[n] = climbStairs(n - 1) + climbStairs(n - 2) + climbStairs(n - 3);
        return memo[n];
    }
}

