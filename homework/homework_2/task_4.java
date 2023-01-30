package homework.homework_2;
// К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_4 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_1.class.getName());
        FileHandler fh = new FileHandler("hw2_t4_log.txt", true);
        SimpleFormatter sFormatter = new SimpleFormatter();
        fh.setFormatter(sFormatter);
        logger.addHandler(fh);
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число: ");
        int a = sc.nextInt();
        System.out.print("Операция: ");
        String c = sc.next();
        System.out.print("Второе число: ");
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(c).append(b).append("=");
        switch (c) {
            case "+":
                System.out.printf("%d %s %d = %d\n", a, c, b, a+b);
                logger.info(sb.append(a+b).toString());
                break;
            case "-":
                System.out.printf("%d %s %d = %d\n", a, c, b, a-b);
                logger.info(sb.append(a-b).toString());    
                break;
            case "/":
                System.out.println(a/b);
                System.out.printf("%d %s %d = %d\n", a, c, b, a/b);
                logger.info(sb.append(a/b).toString());
                break;
            case "*":
                System.out.printf("%d %s %d = %d\n", a, c, b, a*b);
                logger.info(sb.append(a*b).toString());
                break;
            default:
                System.out.println("Ошибка\n");
                logger.info(sb.append("Ошибка").toString());
                break;
        }
        sc.close();
    }    
    
}
