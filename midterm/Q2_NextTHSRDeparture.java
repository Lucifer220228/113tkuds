import java.util.*;

public class Q2_NextTHSRDeparture {
    // 將 "HH:mm" 時間字串轉為從 00:00 起的分鐘數
    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        return hour * 60 + minute;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取班次數量
        int n = Integer.parseInt(scanner.nextLine().trim());

        // 建立儲存時間陣列
        int[] times = new int[n];
        String[] timeStrs = new String[n];

        // 讀入每班時間，轉為分鐘數儲存
        for (int i = 0; i < n; i++) {
            String time = scanner.nextLine().trim();
            timeStrs[i] = time;
            times[i] = toMinutes(time);
        }

        // 讀取查詢時間並轉為分鐘數
        String queryTime = scanner.nextLine().trim();
        int query = toMinutes(queryTime);

        // 二分搜尋找出第一個 > query 的時間
        int left = 0, right = n - 1;
        int resultIdx = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                resultIdx = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (resultIdx == -1) {
            System.out.println("No train");
        } else {
            System.out.println(timeStrs[resultIdx]);
        }

        scanner.close();
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：
 * - 將時間轉成分鐘數需 O(n)
 * - 使用二分搜尋找出下一班車 → O(log n)
 * - 整體時間複雜度為 O(log n)（查詢操作的主體）
 */
