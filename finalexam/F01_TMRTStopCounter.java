package finalexam;

import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        List<String> stations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stations.add(sc.next());
        }
        
        String start = sc.next();
        String end = sc.next();

        int idx1 = stations.indexOf(start);
        int idx2 = stations.indexOf(end);

        if (idx1 == -1 || idx2 == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(idx1 - idx2) + 1);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：程式中最多掃描站名串列三次：
 * 1. 讀入 n 個站名 → O(n)
 * 2. 使用 indexOf 查找 start → O(n)
 * 3. 使用 indexOf 查找 end → O(n)
 * 所以總體時間複雜度為 O(n)
 */

