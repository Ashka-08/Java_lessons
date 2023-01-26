package seminars.seminar_1;

/* 
 * Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
 * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
*/

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "Cp866"); 
        // "Cp866" для поддержки сканнером русского языка
        // print для вывода
        // println для вывода с переходом на новую строку
        // printf для форматирования
        System.out.print("Имя: "); 
        //Имя: Люба
        // System.out.println("Имя: "); 
        //Имя: 
        //Люба
        String content = input.nextLine();
        System.out.printf("Привет, %s!", content);
        // System.out.println(content);
        input.close(); 
    }
}
