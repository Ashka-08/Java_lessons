package homework.homework_3;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 1, 4, 3, 6, 2));
        System.out.println("Исходный массив " + list);
        for (int i=0 ; i<list.size(); i++){
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println("Итоговый массив " + list);
    }
}
