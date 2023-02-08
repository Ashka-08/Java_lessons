# Java

## Лекции
___
### Лекция 1
___

**task_1**

Объявление переменных, Типы данных, Массивы, Форматирование вывода, If else, While / While do, For each / For in, Switch case

**task_2**
* Объявление переменной через var
* Функция getType(объект)

**task_3**
* import java.util.Scanner
* проверка на дурака

**task_4**
* static void sayHi()
* static int sum(int a, int b)
* Рекурсия факториала static double factor(int n) 
___
### Лекция 2
___
**Ex001_stringsDemo**
* String и String[]
* String.join
* toLowerCase()

**Ex002_fileSystemDemo**
* import java.io.File;
* getProperty()
* getAbsolutePath()

**Ex003_tryDemo**
* createNewFile()
* fileWriter.write("new line");
* fileWriter.append("new line");
* fileWriter.append(System.lineSeparator());
* fileWriter.flush()
* BufferedReader bufReader = new BufferedReader(new FileReader(file));
* line = bufReader.readLine();

**Ex004_bFile**
* import java.io.BufferedInputStream;
* import java.nio.ByteBuffer;
* import java.nio.ByteOrder;
* import java.nio.charset.Charset;
* import java.nio.charset.StandardCharsets;
* import java.util.HashMap;
* import java.util.Map;
* import java.util.Map.Entry;
* import java.io.IOException;
* import java.io.InputStream;
* import java.io.OutputStream;
* import java.io.FileInputStream;
* import java.io.BufferedOutputStream;
* import java.io.FileOutputStream;

**Ex005_Logger**
* import java.io.IOException;
* import java.util.logging.*;

**examples**

* import java.io.File;
* import java.io.BufferedReader;
* import java.util.logging.*;
* string и StringBuilder
* Создать строку из 1 млн плюсиков

Работа с файловой системой:
* Файлы
* Ошибки
* Каталоги
* Логирование

**log**

Тестовое логирование от Ex005_Logger

___
### Лекция 3
___

**EX000**

GetType(Object obj)

**EX000_1**

Sum(Object a, Object b)

**EX001**

Копировние массива через System.arraycopy(array, 0, temp, 0, length); }

**EX002**

Создание ArrayList и добавление элементов через .add()

**EX003**

Способы объявления ArrayList

**EX004**

Создание List через Arrays.asList()

**EX005_ArraysMethod**

Методы для ArrayList

**EX005**

List<StringBuilder> d = Arrays.asList(day, month, year)

**EX006**

List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y')

remove and copyOf

**EX007**

iterator and hasNext()

___
### Лекция 4
___

**EX000**

import java.util.PriorityQueue

**EX001**

import java.util.LinkedList

**EX002**

import java.util.Queue

**EX003**

Deque<Integer> deque = new ArrayDeque<>();

**EX004**

Stack<Integer> stack = new Stack<>();

**EX005**

* Решение выражения в постфиксной форме записи через Stack
* import java.util.Stack
* функция private static boolean isDigit(String s) throws NumberFormatException через try-catch и Integer.parseInt(s)

___
## Семинары
___
### Семинар 1
___
**task_1**

Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

**task_2**

import java.time.LocalDateTime;

функция LocalDateTime. В зависимости от времени выводить разное приветсвие

**task_3**

Дан массив двоичных чисел, например [1,1,0,1,1,1]. Вывести максимально количество идущих подряд 1.

**task_4**

Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, 
нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива 
должны быть отличны от заданного, а остальные - равны ему

`Пример: 3 2 1 3 5 6`

`Вывод: 2 1 5 6 3 3 */`
___
### Семинар 2
___
**task_1**

Дано четное число N (>0) и символы c1 и c2.  Написать метод, который вернет строку длины N,  которая состоит из чередующихся символов c1 и c2, начиная с c1.

**task_2**

Напишите метод, который сжимает строку. 

Пример: вход aaaabbbcdd.

Вывод: a4b3cd2 // a4b3c1d2 (StringBuilder)

**task_3**

Есть некое слово, например test. Нужно его повторить 100 раз и записать это все в файлик.

___
### Семинар 3
___
**task_1**

Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран

**task_2**

Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.

**task_3**

Создать список типа ArrayList. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа
___
## Домашние задания
___
### Домашняя работа 1
___
**task_1**

Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 

`тр 5 = 1+2+3+4+5 `

` 5! = 1*2*3*4*5 `

**task_2**

Вывести все простые числа от 1 до 1000

**task_3**

Реализовать простой калькулятор (+,-,*,/)

Scanner sc = ... 

int a = sc.nextLine 

int b = sc.nextLine

**task_4**

Дополнительно* 

Задано уравнение вида x + y = z. И (x, y, z) >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

Вывод 24 + 45 = 69
___
### Домашняя работа 2
___

**task_1**

Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

**task_2**

Дана json строка (читать из файла и сохранить в файл) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!)

[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова",
"оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Если .txt

"фамилия":"Иванов","оценка":"5","предмет":"Математика"

"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:

Студент Иванов получил 5 по предмету Математика.

Студент Петрова получил 4 по предмету Информатика.

Студент Краснов получил 5 по предмету Физика.

**task_3**

Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

**task_4**

4*. К калькулятору из предыдущего дз добавить логирование.

### Домашняя работа 3
___
**task_1**

Пусть дан произвольный список целых чисел, удалить из него четные числа

**task_2**

Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

**task_3**

Реализовать алгоритм сортировки слиянием (Дополнительное)

