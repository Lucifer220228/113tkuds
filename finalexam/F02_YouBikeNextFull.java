package finalexam;

import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] schedule = new int[n];
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(":");
            schedule[i] = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        }

        String[] qParts = sc.nextLine().split(":");
        int query = Integer.parseInt(qParts[0]) * 60 + Integer.parseInt(qParts[1]);

        int left = 0, right = n - 1;
        int resultIdx = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (schedule[mid] > query) {
                resultIdx = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (resultIdx == -1) {
            System.out.println("No bike");
        } else {
            int mins = schedule[resultIdx];
            System.out.printf("%02d:%02d\n", mins / 60, mins % 60);
        }
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：
 * - 輸入時間表為已遞增排序，可使用二分搜尋找尋第一個大於查詢時間的時間點。
 * - 二分搜尋過程中，每次將搜尋區間折半，因此時間複雜度為 O(log n)。
 */


