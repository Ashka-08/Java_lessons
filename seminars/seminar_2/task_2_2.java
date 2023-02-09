package seminars.seminar_2;

// Архиватор
// fffhhhhrr - 3f4h2r

import java.util.Scanner;
public class task_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        System.out.print("Введите стоку: ");
        String line = sc.next();
        sc.close();

        int count = 0;
        char sign = line.charAt(0);
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i)==sign){
                count++;
                } else {
                    res.append(count).append(sign);
                    count=1;
                    sign=line.charAt(i);
            }
        }
        res.append(count).append(sign);
        System.out.println(res);
        }
}
