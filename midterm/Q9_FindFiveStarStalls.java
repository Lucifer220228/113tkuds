import java.util.Scanner;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀入攤位數
        int n = Integer.parseInt(scanner.nextLine().trim());

        // 讀入評分陣列
        String[] parts = scanner.nextLine().trim().split(" ");
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(parts[i]);
        }

        // 第一次走訪：計算符合條件的數量
        int count = 0;
        for (int score : scores) {
            if (score == 5) count++;
        }

        // 輸出
        if (count == 0) {
            System.out.println("None");
        } else {
            int[] indices = new int[count];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                if (scores[i] == 5) {
                    indices[idx++] = i;
                }
            }
            // 印出索引
            for (int i = 0; i < count; i++) {
                System.out.print(indices[i]);
                if (i < count - 1) System.out.print(" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
