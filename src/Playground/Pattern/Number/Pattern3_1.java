package Playground.Pattern.Number;

import static Utilities.Helper.*;

public class Pattern3_1 {
    public static int[][] temp = new int[9][16];

    public static void main(String[] args) {
        print("Enter the number of raw: ");
        int r = ScanInteger();
        pattern1(r);
    }

    private static void pattern1(int r) {
        for (int i = 1; i < r + 1; i++) {
            int triangleLowestXPoint = r - i + 1;
            int triangleHighestXPoint = r + i - 1;
            int column = 2 * r - 1;
            for (int j = 1; j <= column; j++) {
                if (i == 1) {
                    if (j == r) {
                        temp[i][j] = 1;
                        print(1);
                    } else print(" ");
                } else if (j == triangleLowestXPoint || j == triangleHighestXPoint) {
                    temp[i][j] = 1;
                    print(1);
                } else if ((i + j) % 2 == 1 && j > triangleLowestXPoint && j < triangleHighestXPoint) {
                    temp[i][j] = temp[i - 1][j - 1] + temp[i - 1][j + 1];
                    print(temp[i][j]);
                } else print(" ");
            }
            println("");
        }
    }
}
