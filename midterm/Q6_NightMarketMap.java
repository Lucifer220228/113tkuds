import java.util.Scanner;

public class Q6_NightMarketMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 建立 10x10 地圖並初始化為 #
        char[][] map = new char[10][10];
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                map[r][c] = '#';
            }
        }

        // 讀取攤位數
        int m = Integer.parseInt(scanner.nextLine().trim());

        // 標記熱門攤位
        for (int i = 0; i < m; i++) {
            String[] parts = scanner.nextLine().trim().split(" ");
            int row = Integer.parseInt(parts[0]);
            int col = Integer.parseInt(parts[1]);

            // 檢查是否合法座標
            if (row >= 0 && row < 10 && col >= 0 && col < 10) {
                map[row][col] = '*';
            }
        }

        // 列印地圖
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(map[r][c]);
            }
            System.out.println();
        }

        scanner.close();
    }
}

