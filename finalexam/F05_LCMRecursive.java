package finalexam;

import java.util.Scanner;

public class F05_LCMRecursive {

    static int gcd(int a, int b) {
        if (a == b) return a;
        if (a > b) return gcd(a - b, b);
        else return gcd(a, b - a);
    }

    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = lcm(a, b);
        System.out.println("LCM: " + result);
    }
}

/*
 * Time Complexity: O(max(a, b))
 * 說明：
 * - 輾轉相減法在每次遞迴中將較大數字減去較小數字，使得參數至少減少 1。
 * - 最壞情況下，時間複雜度約為 O(max(a, b))，因為需要最多做 max(a,b) 次遞迴呼叫。
 * - 相較於輾轉相除法（O(log(min(a,b)))），輾轉相減法效率較低。
 */

