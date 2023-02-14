package homework.homework_6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        Set<NoteBook> bd = createSet();

        for (NoteBook item : bd) {
            System.out.println(item.toString());
        }

        Map<String, String> uFil = userFilter(iScanner);
        System.out.println("Минимальные критерии отбора: " + uFil);
        iScanner.close();

        Set<NoteBook> setSearch = filterdBd(bd, uFil);
        if (setSearch.isEmpty()) {
            System.out.println("По вашим параметрам ничего не найдено");
        } else {
            System.out.println("Результат фильтра:");
            for (NoteBook item : setSearch) {
                System.out.println(item.toString());
            }
        }
        
    }

    public static Set<NoteBook> createSet() {
        NoteBook notebook1 = new NoteBook("Asus D543MA", 4, 1024, "Windows", "черный");
        NoteBook notebook2 = new NoteBook("Asus E410KA", 8, 512, "без ОС", "серебристый");
        NoteBook notebook3 = new NoteBook("Acer SF114", 8, 128, "без ОС", "черный");
        NoteBook notebook4 = new NoteBook("Acer EX215", 16, 512, "Windows", "серебристый");
        NoteBook notebook5 = new NoteBook("Apple MacBook Air", 8, 256, "macOS", "золотистый");
        NoteBook notebook6 = new NoteBook("Asus D543M", 4, 1024, "Windows", "черный");
        NoteBook notebook7 = new NoteBook("Asus E410K", 8, 512, "без ОС", "серебристый");
        NoteBook notebook8 = new NoteBook("Acer SF11", 8, 128, "Windows", "черный");
        NoteBook notebook9 = new NoteBook("Acer EX21", 16, 512, "без ОС", "золотистый");
        NoteBook notebook10 = new NoteBook("Apple MacBook Air Pro", 16, 1024, "macOS", "серебристый");

        Set<NoteBook> bd = new HashSet<>(List.of(notebook1, notebook2, notebook3, 
        notebook4, notebook5, notebook6, notebook7, notebook8, notebook9, notebook10));

        return bd;
    }

    public static Map<String, String> userFilter(Scanner iScanner) {
        Map<String, String> mapFilter = new HashMap<>();
        int key = 0;
        String value;
        while (key < 5) {
            System.out.println("""
                Введите цифру, соответствующую необходимому критерию:
                1 - ОЗУ   2 - Объем ЖД   3 - Операционная система   4 - Цвет   5 - поиск""");
            key = iScanner.nextInt();
            
            if (key == 1) {
                System.out.println("Введите минимальное значение ОЗУ, от 4Гб до 16Гб");
                value = iScanner.next();
                mapFilter.put("ram", value);
                
            } else if (key == 2) {
                System.out.println("Введите минимальное значение объема ЖД, 128Гб до 1024Гб");
                value = iScanner.next();
                mapFilter.put("ssd", value);
            } else if (key == 3) {
                System.out.println("""
                Введите цифру, соответствующую необходимой ОС:
                1 - Windows   2 - macOS   3 - без ОС""");
                int flag = iScanner.nextInt();
                if (flag == 1) {mapFilter.put("os", "Windows");} 
                else if (flag == 2) {mapFilter.put("os", "macOS");} 
                else if (flag == 3) {mapFilter.put("os", "без ОС");} 
                else {System.out.println("Ошибка");}
            } else if (key == 4) {
                System.out.println("""
                Введите цифру, соответствующую необходимому цвету:
                1 - черный   2 - серебристый   3 - золотистый""");
                int flag = iScanner.nextInt();
                if (flag == 1) {mapFilter.put("colour", "черный");} 
                else if (flag == 2) {mapFilter.put("colour", "серебристый");} 
                else if (flag == 3) {mapFilter.put("colour", "золотистый");} 
                else {System.out.println("Ошибка");}
            }
        }
        return mapFilter;
        
    }

    public static Set<NoteBook> filterdBd (Set<NoteBook> bd, Map<String, String> uFilter) {
        Set<NoteBook> temp = new HashSet<>(bd);
        for (NoteBook noteBook : bd) {
            for (Object couple : uFilter.keySet()) {
                if (couple.equals("ssd") &&
                    noteBook.getSsd() < Integer.parseInt(uFilter.get(couple))) {
                        temp.remove(noteBook);
                } else if (couple.equals("os") &&
                    !noteBook.getOs().equals(uFilter.get(couple))) {
                        temp.remove(noteBook);
                } else if (couple.equals("colour") &&
                    !noteBook.getColour().equals(uFilter.get(couple))) {
                    temp.remove(noteBook);
                }
            }
            // for (var item : uFilter.entrySet()) {
            //     if (item.getKey().equals("ram") &&
            //     noteBook.getRam() < Integer.parseInt(item.getValue())) {
            //         temp.remove(noteBook);
            //     } else if (item.getKey().equals("ssd") &&
            //     noteBook.getSsd() < Integer.parseInt(item.getValue())) {
            //         temp.remove(noteBook);
            //     } else if (item.getKey().equals("os") &&
            //     !noteBook.getOs().equals(item.getValue())) {
            //         temp.remove(noteBook);
            //     } else if (item.getKey().equals("colour") &&
            //     !noteBook.getColour().equals(item.getValue())) {
            //         temp.remove(noteBook);
            //     }
            // }
        }
        return temp;
    }
}