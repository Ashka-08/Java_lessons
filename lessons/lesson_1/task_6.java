package lessons.lesson_1;

//Чтение, Вариант посимвольно

import java.io.*;

public class task_6 {
    public static void main(String[] args) {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
        fr.close();
    }
}
