package seminars.seminar_6;
/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
Распечатайте содержимое данного множества.

2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
Распечатайте содержимое данного множества.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class task_1 {
    public static void main(String[] args) {
        // хранит очередность в порядке возрастания
        // Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 200, 4, 5, 3, 6));
        // set.add(1); set.add(2); set.add(3); //так тоже работает
        // set.add(2); set.add(4); set.add(5);
        // set.add(6); set.add(3);
        System.out.println(set);

        // сохраняет очереднсть ввода
        // Set<Integer> linset = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        Set<Integer> linset = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 200, 4, 5, 3, 6));
        // linset.add(1); linset.add(2); linset.add(3); //так тоже работает
        // linset.add(2); linset.add(4); linset.add(5);
        // linset.add(6); linset.add(3);
        System.out.println(linset);
    }
}
