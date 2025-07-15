import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取比賽場數
        int n = Integer.parseInt(scanner.nextLine().trim());

        // 讀取勝敗陣列
        String[] parts = scanner.nextLine().trim().split(" ");
        int[] wins = new int[n];
        for (int i = 0; i < n; i++) {
            wins[i] = Integer.parseInt(parts[i]);
        }

        // 讀取查詢場數 k
        int k = Integer.parseInt(scanner.nextLine().trim());

        // 計算 prefix sum
        int[] prefix = new int[n];
        prefix[0] = wins[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + wins[i];
        }

        // 輸出前 k 場的 prefix sum
        System.out.print("PrefixSum:");
        for (int i = 0; i < k; i++) {
            System.out.print(" " + prefix[i]);
        }
        System.out.println();

        scanner.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * - 建立 prefix sum 陣列需走訪原始陣列一次 → O(n)
 * - 輸出前 k 個值 → O(k)，但 k ≤ n
 * - 整體複雜度為 O(n)
 */
