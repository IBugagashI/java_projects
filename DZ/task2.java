/*

Вывести все простые числа от 1 до 1000

 */

package DZ;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = iScanner.nextInt();
        boolean b = true;
        for (int i = 2; i <= input; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.print(i + " ");
            else b = true;
        }
        iScanner.close();
    } 
}