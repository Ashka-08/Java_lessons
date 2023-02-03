package seminars.seminar_3;
/* 
 * Заполнить список десятью случайными числами. 
 * Отсортировать список методом sort() и вывести его на экран
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        //int a = random.nextInt(10);

        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(10));
        }

        list1.sort(Comparator.naturalOrder());
        for (Object x : list1) {
            System.out.print(x + " ");
        }
    }
}
