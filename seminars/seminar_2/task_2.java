package seminars.seminar_2;
/* 
 * Напишите метод, который сжимает строку. 
 * Пример: вход aaaabbbcdd.
 * Вывод: a4b3cd2 // a4b3c1d2 (StringBuilder)
*/
// str.charAt(i) обращение к символу в строке

import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = input.nextLine();
        input.close();

        System.out.println(archiv(str));
    }

    public static String archiv(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count ++;
            } else {
                sb.append(str.charAt(i)).append(count);
                // sb.append(str.charAt(i)).append(Integer.toString(count))
                count = 1;
            }    
        }
        sb.append(str.charAt(str.length()-1)).append(count);
        return sb.toString();
    }
}
