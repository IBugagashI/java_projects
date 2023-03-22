/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
*/

package DZ3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = iScanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        Random dot = new Random();
        for(int i = 0; i < size; i++){
            int x = dot.nextInt(10);
            arr.add(x);
        }

        double middle = Sum(arr) / size;

        System.out.println("Список ваших чисел: " + arr.toString());
        System.out.println("Максимальное число из списка: " + Collections.max(arr));
        System.out.println("Минимальное число из списка: " + Collections.min(arr));
        System.out.println("Среднее арифметическое списка: " + middle);
    }
    public static double Sum (List<Integer> list) {
        double sum = 0;
        for (int i: list) {
            sum += i;
        }
        return sum;
    }
}