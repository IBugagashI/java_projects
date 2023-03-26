/*
В калькулятор добавьте возможность отменить последнюю операцию.
*/

package DZ4;

import java.util.LinkedList;
import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        LinkedList<String> calculator  = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Начните ввод. Для отмены последнего ввода, введите Delete: ");
        while(true){
            String x = iScanner.next();
            if(x.equals("Delete")){
                calculator.removeLast();
            }
            else{
                calculator.add(x);
            }
            System.out.println("Результат = " + Result(calculator));
        }
    
    }
    public static int Result(LinkedList<String> list){
        int Result = Integer.parseInt(list.get(0));
        for(int i = 1; i < list.size(); i++){
            if(list.get(i - 1).equals("+")){
                Result += Integer.parseInt(list.get(i));
            }
            else if (list.get(i - 1).equals("-")){
                Result -= Integer.parseInt(list.get(i));
            }
            else if (list.get(i - 1).equals("*")){
                Result *= Integer.parseInt(list.get(i));
            }
            else if (list.get(i - 1).equals("/")){
                Result /= Integer.parseInt(list.get(i));
            }
        }
        return Result;
    }
}
