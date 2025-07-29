package finalexam;

import java.util.*;

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String[] names = new String[n];
        int[] qtys = new int[n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            names[i] = parts[0];
            qtys[i] = Integer.parseInt(parts[1]);
        }

        for (int i = 1; i < n; i++) {
            String tempName = names[i];
            int tempQty = qtys[i];
            int j = i - 1;
            while (j >= 0 && qtys[j] < tempQty) {
                names[j + 1] = names[j];
                qtys[j + 1] = qtys[j];
                j--;
            }
            names[j + 1] = tempName;
            qtys[j + 1] = tempQty;
        }

        int limit = Math.min(10, n);
        for (int i = 0; i < limit; i++) {
            System.out.println(names[i] + " " + qtys[i]);
        }
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：
 * - 插入排序在最壞情況（完全反向排序）下需進行約 n^2/2 次比較與移動操作。
 * - 對 n 筆資料進行排序，因此時間複雜度為 O(n^2)。
 * - 最後輸出前 10 名需 O(1) 時間，對總體時間複雜度影響甚微。
 */

