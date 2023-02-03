package homework.homework_3;
/*
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее ариф. из этого списка
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 1, 4, 3, 6, 2));
        System.out.println("Исходный массив " + list);
        System.out.println("Min = " + Collections.max(list));
        System.out.println("Max = " + Collections.min(list));

        int sum = 0;
        for (int i=0; i< list.size(); i++) {
                sum += i;
        }
        System.out.println("Среднее арифметическое = " + sum / list.size());
    }
}
