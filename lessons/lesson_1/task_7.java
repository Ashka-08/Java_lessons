package lessons.lesson_1;

//Чтение, Вариант построчно

import java.io.*;

public class task_7 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
