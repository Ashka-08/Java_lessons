package homework.homework_4;
/* 
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
*/

import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    public static void Enqueue(LinkedList<String> linlist, Scanner iScanner) { 
        System.out.print("Введите элемент: ");
        linlist.add(iScanner.next());
    }

    public static void Dequeue(LinkedList<String> linlist) {
        System.out.printf("Удален элемент '%s'\n", linlist.getFirst());
        linlist.removeFirst();
    }

    public static String First(LinkedList<String> linlist) {
        return linlist.get(0);
    }

    public static int Menu(Scanner iScanner) {
        System.out.println("""
            Выберите вариант: 
            1. Поместить элемент в конец очереди
            2. Вывести первый элемент очереди и удалить его
            3. Вывести первый элемент очереди
            4. Завершить работу\s""");
        System.out.print("Введите номер пункта: ");
        int flag = iScanner.nextInt();
        return flag;
    }

    public static void main(String[] args) {
        LinkedList<String> linList = new LinkedList<>();
        linList.add("Первый");
        linList.add("Второй");
        Scanner iScanner = new Scanner(System.in, "Cp866");
        int flag = 0;
        while (flag < 4) {
            flag = Menu(iScanner);
            if (flag == 1) {
                // Поместить элемент в конец очереди
                Enqueue(linList, iScanner);
                System.out.println(linList);
                System.out.println("---------");
            } else if (flag == 2) {
                // Вывести первый элемент очереди и удалить его
                Dequeue(linList);
                System.out.println(linList);
                System.out.println("---------");
            } else if (flag == 3) {
                // Вывести первый элемент очереди, не удаляя
                System.out.println(First(linList));
                System.out.println("---------");
            }
        }
        iScanner.close();
    }
}
