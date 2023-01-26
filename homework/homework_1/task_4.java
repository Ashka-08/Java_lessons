package homework.homework_1;
/* 
 * Задано уравнение вида x + y = z. И (x, y, z) >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 * Вывод 24 + 45 = 69
*/

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите уравнение вида x? + ?y = z, где (x, y, z) >= 0: ");
        String input = sc.nextLine();
        String message = "Нет решения!";
        for (int i = 0; i < 10; i++) {
            String result = input.replace("?", Integer.toString(i));
            String[] arr = result.split(" ");
            if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]))
                        message = result;
            }
        System.out.println(message);
        sc.close();
    }
}
