package homework.homework_4;
/* 
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод(не void), который вернет “перевернутый” список.
*/

import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args)  {
        LinkedList<String> linList = new LinkedList<>();
        linList.add("1");
        linList.add("2");
        linList.add("3");
        linList.add("4");
        linList.add("5");
        System.out.println(linList);
        linList = Reverse(linList);
        System.out.println(linList);
    }
    public static LinkedList<String> Reverse(LinkedList<String> lst) {
        for (int i = 0; i < lst.size(); i++) {
            lst.add(lst.size()-i-1, lst.pop());
        }
        return lst;
    }
}
