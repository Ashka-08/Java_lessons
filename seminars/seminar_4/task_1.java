package seminars.seminar_4;

// Выяснить время добавления элементов в аррейлист и линкедлист

import java.util.ArrayList;
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<>();
        LinkedList<Integer> linList = new LinkedList<>();
        
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) 
        {
            arList.add(i); // тестить это значение arList.add(0,i) до i < 10000;
        }
        
        // long timeStart = System.currentTimeMillis(); // для сравнения по поиску элемента
        // System.out.println(arList.indexOf(999999));

        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);

        System.out.println("-------");

        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            linList.add(i);
        }
        
        // timeStart = System.currentTimeMillis();
        // System.out.println(linList.indexOf(999999));

        timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish-timeStart);
        
    }
}
