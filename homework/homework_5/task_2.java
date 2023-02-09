package homework.homework_5;

/*
Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности Имени.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class task_2 {
    public static void main(String[] args) {
        Map<String, Integer> db = new HashMap<>();
        String employees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] arr = employees.split(" ");
        for (int i = 0; i < arr.length; i += 2) {
            if (db.containsKey(arr[i])) {
                db.replace(arr[i], db.get(arr[i]) + 1);
            } else {
                db.put(arr[i], 1);
            }
        }
        System.out.println(db);
        Map<String, Integer> sortedDB = new LinkedHashMap<>();
        int max = 1;
        for (int value : db.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : db.entrySet()) {
                String key = entry.getKey();
                if (db.get(key) == i) {
                    sortedDB.put(key, db.get(key));
                }
            }
        }
        System.out.println(sortedDB);
    }
}
