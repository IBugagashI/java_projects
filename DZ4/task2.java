/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
*/

package DZ4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Укажите размер списка: ");
        int size = iScanner.nextInt();
        Random digit = new Random();
        for(int i = 0; i < size; i++){
            arr.add(digit.nextInt(10));
        }
        System.out.println("Ваш начальный список: " + arr);
        System.out.print(
        "Какую операцию провести со списком?\n" +
        "***first - возвращает первый элемент из очереди, не удаляя***\n" +
        "***dequeue - возвращает первый элемент из очереди и удаляет его***\n" +
        "***enqueue - помещает ВЫбРАНЫЙ элемент в конец очереди***\n"+
        "***enqueue2 - помещает НОВЫЙ элемент в конец очереди***\n"+
        "Впишите нужную команду: "
        );
        String action = iScanner.next();
        switch(action){
            case "first":
                System.out.println("Первый элемент вашего списка: " + First(arr));
                break;
            case "dequeue":
                System.out.println("Удалённый элемент из вашего списка: " + First_del(arr));
                break;
            case "enqueue":
                System.out.println("Список с ПЕРЕМЕЩЁННЫМ элементом в конец: " + Enqueue(arr));
                break;
            case "enqueue2":
                System.out.println("Список с НОВЫм элементов в конец: " + Enqueue2(arr));
                break;
        }

        iScanner.close();
    }

    public static int First(LinkedList<Integer> list){
        int x = list.get(0);
        System.out.println("Ваш список: " + list);
        return x;
    } 
    public static int First_del(LinkedList<Integer> list){
        int x = list.get(0);
        list.remove(0);
        System.out.println("Ваш список: " + list);
        return x;
    }
    public static LinkedList<Integer> Enqueue(LinkedList<Integer> list){
        System.out.print("Укажите номер элемента для перемещения(счёт начинайте с 0): ");
        Scanner iScanner = new Scanner(System.in);
        int i = iScanner.nextInt();
        list.add(list.get(i));
        list.remove(i);
        return list;
    }
    public static LinkedList<Integer> Enqueue2(LinkedList<Integer> list){
        System.out.print("Укажите значение для добавления: ");
        Scanner iScanner = new Scanner(System.in);
        int i = iScanner.nextInt();
        list.add(i);
        return list;
    }
}