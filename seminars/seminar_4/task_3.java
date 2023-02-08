package seminars.seminar_4;

/* 
 * Принимает от пользователя строчки и запоминает их в стек, 
 * если команда принт - выводит первую введенную строку
*/

import java.util.Stack;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        String str = "";

        while (!str.equalsIgnoreCase("print")) {
            System.out.print("Введите команду: ");
            str = scan.next();
            if (!str.equalsIgnoreCase("print")) {
                stack.push(str); 
            }
        }
        scan.close();

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }

        // while (stack.empty()) {
        //     System.out.println(stack.pop());
        // }
    }
}
