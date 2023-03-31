/*
 * 
Написать программу, которая найдет и выведет повторяющиеся
имена с количеством повторений.
Отсортировать по убыванию популярности Имени.
 * 
 */

package DZ5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class task2 {
    public static void main(String[] args) {
        List<String> NameArr = List.of("Иван Иванов", 
        "Светлана Петрова", 
        "Кристина Белова", 
        "Анна Мусина", 
        "Анна Крутова", 
        "Иван Юрин", 
        "Петр Лыков", 
        "Павел Чернов", 
        "Петр Чернышов",
        "Мария Федорова",
        "Марина Светлова",
        "Мария Савина",
        "Мария Рыкова",
        "Марина Лугова",
        "Анна Владимирова",
        "Иван Мечников",
        "Петр Петин",
        "Иван Ежов"); 
        System.out.println(Count(Name(NameArr)));
    }

    //TreeMap<String, Integer> tMap = new TreeMap<>();

    public static List<String> Name(List<String> list){
        List<String> name = new ArrayList<>();
        for(String i: list){
            String[] step = i.split(" ");
            name.add(step[0]);
        }
        return name;
    }
   
    public static Map<String, Integer> Count(List<String> list){
        Map<String, Integer> CountMap = new HashMap<>();
        for(String i: list){
            if (CountMap.containsKey(i)) {
                CountMap.put(i, CountMap.get(i) + 1);
              } else {
                CountMap.put(i, 1);
              }
        }
        
        //не понимаю как, но работает
        CountMap = CountMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (oldValue, newValue) -> oldValue,
                                        LinkedHashMap::new
                    ));

        return CountMap;
    }
}