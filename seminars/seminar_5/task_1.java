package seminars.seminar_5;

import java.util.HashMap;
import java.util.Map;

/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */
public class task_1 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(123456, "Иванов");
        db.put(321456, "Васильев");
        db.put(234561, "Петрова");
        db.put(234432, "Иванов");
        db.put(654321, "Петрова");
        db.put(345678, "Иванов");
        for (var item : db.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.println(item.getKey());
            }
        }

        // String secondName ="Иванов";
        // for (int str:db.keySet()){
        //     if (db.get(str).equals(secondName)){
        //         System.out.printf("%s %s \n", str, db.get(str));
        //     }
        // }
    }
}
