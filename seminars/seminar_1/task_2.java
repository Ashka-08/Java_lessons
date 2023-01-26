package seminars.seminar_1;

import java.time.LocalDateTime;

// функция LocalDateTime. В зависимости от времени выводить разное приветсвие

public class task_2 {
    public static void main(String[] args) {
        System.out.printf("Сейчас время: %d\n", LocalDateTime.now().getHour());
        int hourNow = LocalDateTime.now().getHour();
        if (hourNow > 5 && hourNow < 12) {
            System.out.println("Доброе утро!");
        } else if (hourNow > 12 && hourNow < 18) {
            System.out.println("Добрый день!");
        } else if (hourNow > 18 && hourNow < 22) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Доброй ночи!");
        }
    }
}
