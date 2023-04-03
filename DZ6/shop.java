/*
 * 
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
//NoteBook notebook1 = new NoteBook
//NoteBook notebook2 = new NoteBook
//NoteBook notebook3 = new NoteBook
//NoteBook notebook4 = new NoteBook
//NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих * 
 */

package DZ6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class shop {
   public static void main(String[] args) {
      NoteBook notebook1 = new NoteBook("4", "512", "Win", "black");
      NoteBook notebook2 = new NoteBook("4", "512", "Lnx", "black");
      NoteBook notebook3 = new NoteBook("8", "1024", "Win", "white");
      NoteBook notebook4 = new NoteBook("8", "1024", "Lnx", "white");
      NoteBook notebook5 = new NoteBook("16", "2048", "Win", "gray");

      Set<NoteBook> notebooks = new HashSet<>(List.of(notebook1, notebook2, notebook3, notebook4, notebook5));

      Map<String, String> sel = selectCriteria();
      sort(sel, notebooks);
   }

   public static String scanner() {
      Scanner iScanner = new Scanner(System.in);
      String scan = iScanner.nextLine();
      return scan;
   }

   public static Map<String, String> selectCriteria() {
      Map<String, String> resultCriterias = new HashMap<>();
      while (true) {
         System.out.print("Подобрать характеристики? Да - Y Нет - N: ");
         String question = scanner();
         if (question.equals("N")) {
            break;
         } else {

            System.out.println("По каким параметрам подбираем: \n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - Цвет");
            String key = scanner();
            System.out.print("Введите значения для выбранного критерия: ");
            String value = scanner();

            resultCriterias.put(key, value);
         }
      }
      return resultCriterias;

   }

   public static void sort(Map<String, String> criterias, Set<NoteBook> notebooks) {
      Set<NoteBook> temp = new HashSet<>(notebooks);
      for (NoteBook notebook : notebooks) {

         for (Object pair : criterias.keySet()) {

            if (pair.equals("1") && !notebook.getRam().equals(criterias.get(pair))) {
               temp.remove(notebook);
            }
            for (Object pair1 : criterias.keySet()) {

               if (pair1.equals("2") && !notebook.getHardDrive().equals(criterias.get(pair1))) {
                  temp.remove(notebook);
               }
               for (Object pair2 : criterias.keySet()) {
                  if (pair2.equals("3") && !notebook.getSystems().equals(criterias.get(pair2))) {
                     temp.remove(notebook);
                  }
                  for (Object pair3 : criterias.keySet()) {
                     if (pair3.equals("4") && !notebook.getColour().equals(criterias.get(pair3))) {
                        temp.remove(notebook);
                     }
                  }
               }
            }
         }
      }
      if (temp.isEmpty()) {//возвращает true, если этот список не содержит элементов
         System.out.println("По введенным критериям ничего не найдено!");
      } 
      else {
         System.out.println("Подходящие варианты:" + temp.toString().replaceAll("^\\[|\\]$", ""));
      }

   }
}