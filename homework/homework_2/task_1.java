package homework.homework_2;

/* 
 * Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_1 {
    public static void main(String[] args) throws IOException {
        int[] arr = Array();
        System.out.println("\nВведен массив:");
        Print(arr);
        System.out.println("\n");
        Bubble(arr);
        System.out.println("\nОтсортирванный массив:");
        Print(arr);
    }

    public static int[] Array() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.printf("Введите %d число: ", i);
            numbers[i] = input.nextInt();
        }
        input.close();
        return numbers;
    }

    public static int[] Print(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        return arr;
    }
    public static int[] Bubble(int[] arr) throws IOException {
        Logger logger = Logger.getLogger(task_1.class.getName());
        FileHandler fh = new FileHandler("hw2_t1_log.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fh.setFormatter(sFormatter);
        logger.addHandler(fh);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    logger.info(Arrays.toString(arr));
                }
            }
        }    
        return arr;
    }
}
