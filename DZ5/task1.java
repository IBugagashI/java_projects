/*

Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
что 1 человек может иметь несколько телефонов.

 */

package DZ5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Map<String, List<String>> PhoneBook = new HashMap<>();
        PhoneBook.put("Pupa", List.of("111", "111"));
        PhoneBook.put("Lupa", List.of("222", "222"));
        PhoneBook.put("Dupa", List.of("333", "333"));
        boolean flag = true;
        while(flag == true){
            System.out.print("Выбери действия: \n"+
            "Добавить контакт и его МТ - Add\n"+
            "Показать всех - All\n"+
            "Закончить работу - EXIT\n");
            String choice = Input();
            switch(choice){
                case"Add":
                    AddContact(PhoneBook);
                    break;
                case"All":
                    System.out.println(PhoneBook);
                    break;
                case"EXIT":
                    flag = false;
                    break;
            }
        }
    }

    public static String Input(){
        Scanner iScanner  = new Scanner(System.in);
        String str = iScanner.nextLine();
        return str;
    }

    public static Map<String, List<String>> AddContact(Map<String, List<String>> MapList){
        System.out.print("Введи имя: ");
        String name = Input();
        System.out.println("Введи МТ. Для прекращения введите 'stop': ");
        List<String> phones = new ArrayList<>();
        while(true){
            System.out.print("МТ -> ");
            String MT = Input();
            if(MT.equals("stop")){
                break;
            }
            else{
                phones.add(MT);
            }
        }
        MapList.put(name, phones);
        return MapList;
    }
}