package seminars.seminar_4;
/* 
 * Принимает от пользователя строку вида text~num
 *   1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 *   2. Если введено print~num, выводит строку из позиции num в связном списке 
 *      и удаляет её из списка.
 * Принять от пользователя строку вида текст в линкедлист до тех пор пока не "stop" и число
 * Нужно на позицию число добавить элемент
 * Пример
 * Пользователь вводит: "Привет"~4
 * Программа записывает: ["", "", "", "", "Привет", ""]
 * Пользователь вводит: "Пока"~1
 * Программа записывает: ["Пока", "", "", "", "Привет", ""]
 * Пользователь вводит:  print~4
 * Программа выводит: Привет
*/

import java.util.Scanner;
import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {
        // LinkedList<String> linList = new LinkedList<>();
        // String line = "";
        // Scanner iScanner = new Scanner(System.in, "Cp866");
        // System.out.print("Введите команду: ");
        // line = iScanner.next();
        // while (!line.equalsIgnoreCase("stop")) 
        // // не равно - !str1.equals(str2)
        // // equalsIgnoreCase игнор Капслок
        // {
        //     String[] temp = line.split("~");
        //     if (temp[0].equalsIgnoreCase("print")) {
        //         System.out.println(linList.get(Integer.parseInt(temp[1])));
        //         linList.remove(Integer.parseInt(temp[1]));
        //     } else {
        //         linList.add(Integer.parseInt(temp[1]), temp[0]);
        //     }
        //     System.out.print("Введите команду: ");
        //     line = iScanner.next();
        // }

        LinkedList<String> linList = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);
        while(true) {
            // Бесконечный цикл и команда break для выхода из него 
            String input = iScanner.nextLine();
            if (input.equals("stop")) break;
            String[] string = input.split("~");
            if (string[0].equals("print")) System.out.println(linList.remove(Integer.parseInt(string[1])));
            else linList.add(Integer.parseInt(string[1]), string[0]);
        }
        iScanner.close();
    }
}
