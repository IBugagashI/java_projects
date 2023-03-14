/*

Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа -> 

 */
package DZ;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = iScanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = iScanner.nextInt();
        System.out.println("Укажите сивол операции: + - / *");
        String symbol = iScanner.next();
        switch (symbol) {
            case "+":
                System.out.print("Результат: "+ (x + y));
                break;
            case "-":
                System.out.print("Результат: "+ (x - y));
                break;
            case "/":
                System.out.print("Результат: "+ (x / y));
                break;
            case "*":
                System.out.print("Результат: "+ (x * y));
                break;
        }
        iScanner.close();
    }
}