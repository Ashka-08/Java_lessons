package seminars.seminar_2;
/* Есть некое слово, например test. 
 * Нужно его повторить 100 раз и записать это все в файлик.
*/
import java.io.FileWriter;
public class task_3 {

    public static void main(String[] args) {
        String text = "TEXT";
        try {
            // FileReader flread = new FileReader("file.txt");
            FileWriter writer = new FileWriter("s2_t3.txt");
            for (int i=0; i < 100; i++){
            writer.write(text);
            }
            System.out.println("Получилось");
            writer.close();
            }
        catch (Exception e){
            System.out.println("Что то не так");
        }
    }
}

