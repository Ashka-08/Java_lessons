package homework.homework_5;

// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        createPhoneBook(phoneBook);
        Scanner iScanner = new Scanner(System.in, "Cp866");
        int flag = 0;
        while (flag < 3) {
            flag = Menu(iScanner);
            if (flag == 1) {
                allPhoneBook(phoneBook); // Список контактов
                System.out.println("---------");
            } else if (flag == 2) {
                System.out.print("Введите фамилию для поиска: "); // Поиск по фамилии
                String name = iScanner.next();
                findInPhoneBook(name, phoneBook);
                System.out.println("---------");
            } 
        }

        iScanner.close();
    }

    public static void createPhoneBook(Map<String, List<String>> phoneBook) {
        phoneBook.put("Иванов", List.of("+7(111)111-11-11", "+7(222)222-22-22"));
        phoneBook.put("Петров", List.of("+7(333)333-33-33", "+7(444)444-44-44"));
        phoneBook.put("Сидоров",List.of("+7(555)555-55-55", "+7(666)666-66-66", "+7(777)777-77-77"));
    }

    public static void findInPhoneBook(String name, Map<String, List<String>> phoneBook) {
        System.out.printf("%s: %s\n", name, phoneBook.get(name));
    }

    public static void allPhoneBook(Map<String, List<String>> phoneBook) {
        for (var item : phoneBook.entrySet()) {
            System.out.printf("[%s: %s]\n", item.getKey(), item.getValue());
        }
    }

    public static int Menu(Scanner iScanner) {
        System.out.println("""
            Телефонный справочник: 
            1 - Список контактов, 2 - Поиск по фамилии, 3 - Выход""");
        System.out.print("Введите номер пункта: ");
        int flag = iScanner.nextInt();
        return flag;
    }
}
