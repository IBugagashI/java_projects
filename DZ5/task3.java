/*
 * 
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
И вывести Доску.
 * 
 */

package DZ5;

import java.util.List;

public class task3 {
    public static void main(String[] args) {
        int[] ChessDos = new int[8];
        checking(0, ChessDos);

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (ChessDos[row] == col) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    private static boolean checking(int row, int[] arr) {
        if (row == 8) {
            return true;
        }
        for (int col = 0; col < 8; col++) {
            boolean isSafe = true;
            for (int i = 0; i < row; i++) {
                if (arr[i] == col || arr[i] == col - row + i || arr[i] == col + row - i) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) {
                arr[row] = col;
                if (checking(row + 1, arr)) {
                    return true;
                }
            }
        }
        return false;
    }
}