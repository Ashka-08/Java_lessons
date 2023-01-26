package homework.homework_1;
/* 
 * Реализовать простой калькулятор 
 * Scanner sc = ... 
 * int a = sc.nextLine 
 * int b = sc.nextLine
*/

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число: ");
        int a = sc.nextInt();
        System.out.print("Операция: ");
        String c = sc.next();
        System.out.print("Второе число: ");
        int b = sc.nextInt();
        switch (c) {
            case "+":
                System.out.printf("%d %s %d = %d", a, c, b, a+b);
                break;
            case "-":
                System.out.printf("%d %s %d = %d", a, c, b, a-b);    
                break;
            case "/":
                System.out.println(a/b);
                System.out.printf("%d %s %d = %d", a, c, b, a/b);
                break;
            case "*":
                System.out.printf("%d %s %d = %d", a, c, b, a*b);
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
        sc.close();
    }
}
