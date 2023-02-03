package seminars.seminar_3;
/*
 * Создать список типа ArrayList. Поместить в него как строки, так и целые числа. 
 * Пройти по списку, найти и удалить целые числа.
 * Integer.valueOf(list.get(i)) приведет итый эелемент листа к типу инт
*/

import java.util.ArrayList;
import java.util.Arrays;

public class task_3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(Arrays.asList
            (1, "Меркурий", "2.1", "Венера", 3));
        System.out.println("Исходный массив 1 " + list);
        for (int i=0 ; i<list.size(); i++){
            if (list.get(i) instanceof Integer) {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println("Итоговый массив 1 " + list);


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList
            ("1", "Меркурий", "2.1", "Венера", "3"));
        System.out.println("Исходный массив 2 " + list2);
        // for (int i=0 ; i<list2.size(); i++){
        //     try {
        //         int check = Integer.valueOf(list2.get(i));
        //         list2.remove(list2.get(i));
        //         i--;
        //     } catch (Exception e) {
        //     }
        // }
        System.out.println("Итоговый массив 2 " + list2);
    }
}
