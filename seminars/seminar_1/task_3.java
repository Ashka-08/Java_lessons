package seminars.seminar_1;
/* Дан массив двоичных чисел, например [1,1,0,1,1,1].
 * Вывести максимально количество идущих подряд 1.
 */
public class task_3 {
    public static void main(String[] args) {
        Integer[] mas = new Integer[] {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxcount = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 1) {
                count += 1;
            } else {
                if (count > maxcount) {
                    maxcount = count;
                }
                count = 0;
            }
        }
        if (count > maxcount) {
            maxcount = count;
        }
        System.out.println(maxcount);
    }
}
