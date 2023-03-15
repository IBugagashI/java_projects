/*

Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.

 */

package DZ2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task1 {

    public static int[] Arr() {
        int numbers [] = {3, 5, 7, 9, 1, 2, 4, 6, 8};
        return numbers;
    }

    public static int[] BabblSort(int arr[]) throws IOException {
        Logger loger = Logger.getLogger(task1.class.getName());
        FileHandler fHandler = new FileHandler("task1.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);

        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            loger.info(Arrays.toString(arr));
        }
        return arr;

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) throws IOException {

        print(BabblSort(Arr()));
    }
    
}
