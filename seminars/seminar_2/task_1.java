package seminars.seminar_2;

// stroka.equals(stroka2) возвращает булево значение 
// сравнивает равна ли одна строка другой строке

/* 
 * Дано четное число N (>0) и символы c1 и c2. 
 * Написать метод, который вернет строку длины N, 
 * которая состоит из чередующихся символов c1 и c2, начиная с c1.
 * 
 * 6 a b
 * ababab
*/

import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Input n: "); 
        int n = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input c1: "); 
        char c1 = in2.next().charAt(0);

        Scanner in3 = new Scanner(System.in);
        System.out.print("Input c2: "); 
        char c2 = in3.next().charAt(0);

        in1.close();
        in2.close();
        in3.close();

        System.out.printf("StringBuilder: %s", LenStr(n, c1, c2));
        // System.out.printf("String: %s", Concat(n, c1, c2));
    }

    public static StringBuilder LenStr (int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            }
            else {
                sb.append(c2);
            }
        }
        return sb;
    }

    public static String Concat (int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            sb.append(c1);
            sb.append(c2);
            }
        return sb.toString();
    }
}
