package homework.homework_2;
/* 
 * Напишите метод, который принимает на вход строку (String) и 
 * определяет является ли строка палиндромом (возвращает boolean значение).
*/

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        System.out.println(Palindrom(Input()));
    }

    public static String Input() {
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.println("Введите строку:");
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    public static Boolean Palindrom(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.toString().equals(String.valueOf(sb.reverse()));
    }
}
