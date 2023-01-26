package homework.homework_1;

/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n) 
 * тр 5 = 1+2+3+4+5 
 * 5! = 1*2*3*4*5
 */

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = iScanner.nextInt();
        System.out.printf("Треугольное число для %d = %d\n", n, getTriangular(n));
        System.out.printf("Факториал для числа %d = %d\n", n, getFactorial(n));
        iScanner.close();
    }
    
    public static int getTriangular(int n) {
        return n * (n + 1) / 2;
    }

    public static int getFactorial(int n) {
        if (n <= 1) {
           return 1;
        }
        else {
           return n * getFactorial(n - 1);
        }
      }
}
