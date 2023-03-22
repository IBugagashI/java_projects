/*
Пусть дан произвольный список целых чисел, удалить из него чётные числа
*/

package DZ3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class task1 {
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
        System.out.println("Список ваших чисел: " + arr.toString());

        // for (int i = 0; i < arr.size(); i++) {
        //     if (arr.get(i) % 2 == 0) {
        //         arr.remove(i);
        //     } 
        // }       
        // System.out.println("Список без чётных чисел: " + arr.toString());
        
        DeletEven(arr);       
    }
    public static List<Integer> DeletEven(List<Integer> list) {

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Список без чётных чисел: " + list.toString());
        return list;
    }
}