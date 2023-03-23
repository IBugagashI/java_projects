/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
*/

package DZ4;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Укажите размер списка: ");
        int size = iScanner.nextInt();
        for(int i = 0; i < size; i++){
            arr.add(i);
        }
        System.out.println("Ваш список: " + arr);
        iScanner.close();

        //ReversList(arr);
        System.out.println("Перевернутый список: " + ReversList(arr));

    }  

    public static LinkedList<Integer> ReversList(LinkedList<Integer> list){
        LinkedList<Integer> reversArr = new LinkedList<>();
        for(int i = 0; i < list.size(); i++){
            reversArr.addFirst(list.get(i));
        }
        return reversArr;
    }   
}