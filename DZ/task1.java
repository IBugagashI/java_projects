/*

Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 

*/
package DZ;

import java.util.Scanner;
import javax.print.event.PrintJobListener;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        System.out.printf("Укажите число необходимого действия\n1 - Факториал 2 - Треугольное число: ");
        int choice = iScanner.nextInt();
        System.out.printf("Ваше число n: "+ n);
        switch (choice) {
            case 1:
                System.out.printf("\nФакториал: " + factorials(n));
                break;
        
            case 2:
                System.out.printf("\nТреугольное число: " + triple_number(n));
                break;
        }
        iScanner.close();
    }
    public static int triple_number(int a) {
        return (a * (a + 1)) / 2;
    }
    public static int factorials (int a) {
        if(a == 1) return 1;
        return a * factorials(a -1);
    }
}    