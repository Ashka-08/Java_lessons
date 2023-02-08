package lessons.lesson_4;

import java.util.*;

/*
Stack представляет собой обработку данных по принципу LIFO.
Расширяет Vector пятью операциями, которые позволяют рассматривать
вектор как стек
 */

/* 
 * .push(1) добавить
 * .pop() найти и удалить
 * .peek() найти и посмотреть
*/

public class Ex004 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
    }
}
