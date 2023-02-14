package seminars.seminar_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив 
    и с помощью Set вычислите процент уникальных значений в данном массиве 
    и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее кол-во чисел в массиве.
 */

public class task_2 {
    public static void main(String[] args) {
        int[] arr = CreateArray();
        System.out.println(Unique(arr));
    }

    private static double Unique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
           set.add(arr[i]); 
        }
        System.out.println(set);
        return set.size() * 100 / (float)arr.length;
    }

    public static int[] CreateArray() {
        Random rand = new Random();
        int arr[] = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(25);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return arr;
    }

    // public static void main(String[] args) {

    //     ArrayList<Integer> arr = fillArray();
    //     System.out.println(percentUniq(arr));
        
    //     }
        
    //     public static ArrayList<Integer> fillArray() {
    //     ArrayList<Integer> nums = new ArrayList<>();
    //     for (int i = 0; i < 100; i++) {
    //     nums.add(ThreadLocalRandom.current().nextInt(0, 25));
    //     }
    //     return nums;
    //     }
        
    //     public static Float percentUniq(ArrayList<Integer> nums) {
    //     Set<Integer> set = new HashSet<>(nums);
    //     return (set.size() * 100) / (float)nums.size();
    //     }

}
