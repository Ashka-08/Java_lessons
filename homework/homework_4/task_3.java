package homework.homework_4;
// переделать на запоминание операции в стеке

/* 
В калькулятор добавьте возможность отменить последнюю операцию.
Пример
1
+
2
ответ:
3

+
4
ответ:
7

Отмена
3
*
3

ответ:
9
*/

import java.util.Stack;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("""
                Введите команды через интер в формате 1 + 2
                c - отмена последней операции, q - завершение работы.""");
        while (true) {
            if (iScanner.hasNextFloat()) {
                stack.add(iScanner.nextInt());
            } else {
                    String action = iScanner.next();
                    if (action.equals("q")) {
                        break;
                    }
                    if (action.equals("c")) {
                        stack.remove(0);
                        System.out.printf("Отмена,  ответ:\n%d\n", stack.firstElement());
                    }
                    if (iScanner.hasNextFloat()) {
                        stack.add(iScanner.nextInt());
                        int x = stack.firstElement();
                        int y = stack.pop();
                        switch (action) {
                            case "+" -> {
                                stack.add(0, x + y);
                                System.out.printf("Ответ:\n%d\n", stack.firstElement());
                            }
                            case "-" -> {
                                stack.add(0, x - y);
                                System.out.printf("Ответ:\n%d\n", stack.firstElement());
                            }
                            case "*" -> {
                                stack.add(0, x * y);
                                System.out.printf("Ответ:\n%d\n", stack.firstElement());
                            }
                            case "/" -> {
                                stack.add(0, x / y);
                                System.out.printf("Ответ %d\n", stack.firstElement());
                            }
                        }
                    }
                }
            }
        iScanner.close();
    }
}
