import java.util.Scanner;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取攤位數量
        int n = Integer.parseInt(scanner.nextLine().trim());
        double[] scores = new double[n];

        // 讀取各攤位分數
        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(scanner.nextLine().trim());
        }

        // 選擇排序由高到低
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIdx]) {
                    maxIdx = j;
                }
            }
            // 交換
            double temp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = temp;
        }

        // 輸出前 5 名（不足則全列）
        int limit = Math.min(5, n);
        for (int i = 0; i < limit; i++) {
            System.out.printf("%.1f%n", scores[i]);
        }

        scanner.close();
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：
 * - 選擇排序需兩層迴圈，每次找最大值 → O(n^2)
 * - 輸出前 5 筆為 O(1)
 * - 整體主體操作為排序，故總複雜度為 O(n^2)
 */