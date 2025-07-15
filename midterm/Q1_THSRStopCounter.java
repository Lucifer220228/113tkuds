import java.util.*;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取停靠站數 n
        int n = Integer.parseInt(scanner.nextLine().trim());

        // 讀取 n 個站名
        String[] stops = scanner.nextLine().trim().split(" ");

        // 讀取起點與終點
        String[] range = scanner.nextLine().trim().split(" ");
        String start = range[0];
        String end = range[1];

        // 搜尋起訖站位置
        int startIdx = -1;
        int endIdx = -1;
        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) {
                startIdx = i;
            }
            if (stops[i].equals(end)) {
                endIdx = i;
            }
        }

        // 判斷是否有效
        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {
            int stopCount = Math.abs(startIdx - endIdx) + 1;
            System.out.println(stopCount);
        }

        scanner.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * - 我們需要掃描整個停靠站陣列一次來找出 start 與 end 的位置 → O(n)
 * - 其餘操作（比較與輸出）為常數時間 → O(1)
 * 所以總時間複雜度為 O(n)
 */
