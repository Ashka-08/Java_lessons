package seminars.seminar_1;
/* Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, 
нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива 
должны быть отличны от заданного, а остальные - равны ему

Пример: 3 2 1 3 5 6
Вывод: 2 1 5 6 3 3 */

public class task_4 {
    public static void main(String[] args) {                           
        int[] arr = new int[] {3, 2, 1, 3, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        int val = 3;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[count] = arr[i];
                count ++;
            }
        }

        while (count < arr.length) {
            arr[count] = val;
            count ++;
        }
        
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
