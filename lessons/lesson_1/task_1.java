// java task_1.java во встроенном терминале для запуска или кнопкой 

package lessons.lesson_1;

/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        System.out.println("hi, world");
        String s = null; // Объявление переменной и присвоение ей пустого значения
        System.out.println(s);

        short age = 10;
        int salary = 123456;
        System.out.println(age); //10
        System.out.println(salary); //123456

        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415

        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false

        // Неявная типизация
        var a = 123;
        System.out.println(a); // 123
        var aa = 123.456;
        System.out.println(aa); // 123.456

        //Класса обертки
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        // Массивы
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

        // Многомерные массивы
        int[] arr2[] = new int[3][5];
        for (int[] line : arr2) {
        for (int item : line) {
            System.out.printf("%d ", item);
        }
        System.out.println();
        }

        // Массивы массивов
        int[][] arr3 = new int[3][5];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%d ", arr3[i][j]);
            }
            System.out.println();
        }

        // Преобразования
        int i = 123; double d = i;
        System.out.println(i); // 123
        System.out.println(d); // 123.0
        d = 3.1415; i = (int)d;
        System.out.println(d); // 3.1415
        System.out.println(i); // 3
        d = 3.9415; i = (int)d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("123");
        System.out.println(b); // 123
        b = Byte.parseByte("1234");
        System.out.println(b); // NumberFormatException: Value out of range

        // Нельзя положить инт массив в дабл массив, и наоборот, если не писать спец функцию
        int[] m = new int[10];
        double[] n = m; // ИЗУЧАЕМ ковариантность и контравариантность

        // Форматированный вывод
        int ab = 1, bb = 2;
        int c = ab + bb;
        String res = ab + " + " + bb + " = " + c;
        System.out.println(res);

        int ac = 1, bc = 2;
        int cc = ac + bc;
        String resc = String.format("%d + %d = %d \n", ac, bc, cc);
        System.out.printf("%d + %d = %d \n", ac, bc, cc);
        System.out.println(resc);
        /*
         * Виды спецификаторов
            %d: целочисленных значений
            %x: для вывода шестнадцатеричных чисел
            %f: для вывода чисел с плавающей точкой
            %e: для вывода чисел в экспоненциальной форме,
            например, 3.1415e+01
            %c: для вывода одиночного символа
            %s: для вывода строковых значений
         */

        float pi1 = 3.1415f;
        System.out.printf("%f\n", pi1); // 3,141500
        System.out.printf("%.2f\n", pi1); // 3,14
        System.out.printf("%.3f\n", pi1); // 3,141
        System.out.printf("%e\n", pi1); // 3,141500e+00
        System.out.printf("%.2e\n", pi1); // 3,14e+00
        System.out.printf("%.3e\n", pi1); // 3,141e+00

        // Область видимости переменных
        {
            int ii = 123;
            System.out.println(ii);
            }
        System.out.println(ii); // error: cannot find symbol

        // условный оператор
        int ay = 1;
        int by = 2;
        int cy;
        if (ay > by) {
            cy = ay;
        } else {
            cy = by;
        }
        
        // или если один оператор
        // if (a > b) c = a;
        // if (b > a) c = b;

        System.out.println(cy);

        // тернарный оператор
        int a = 1;
        int b = 2;
        int min = a < b ? a : b;
        System.out.println(min);

        // оператор выбора
        int mounth = value;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            ...
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();

        // Цикл while
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);

        // Цикл do while
        int value = 321;
        int count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);

        /*continue, break
        Операторы для управления циклами — continue и break.
        Выполнение следующей итерации цикла — continue.
        Прерывание текущей итерации цикла — break.
        * ближайшего к оператору */

        //for in Оператор цикла 
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);

        // Вложенные циклы
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            System.out.print("* ");
            }
            System.out.println();
            }
            // * * * * *
            // * * * * *
            // * * * * *
            // * * * * *
            // * * * * *

        // for each : ДЛЯ КОЛЛЕКЦИЙ
        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();

    }
}