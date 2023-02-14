package seminars.seminar_6;

import java.sql.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* 
 * Структура класса кот для вет.клиники
*/
public class task_3 {
    public static class Cat {
        private int id;          // айди
        private String name;     // кличка
        String sex;      // пол
        Double weight; // вес
        int age;  // возраст
        int pasport; // паспорт
        HashMap<Date, String> vaccination;  // прививки
        String adress; // адрес
        String owner; // ФИО владельца
        String breed; // порода
        LinkedHashMap<Date, String> diagnosis; // LinkedHashMap обращение - диагноз, лечение
        boolean catChip = false;
        boolean registrated; // регистрация
        
        // методы

        // конструктор класса
        public Cat(String getName, String nameOwner, String adressOwner, 
                                String getBreed, int getId) 
        {
            this.registrated = true;
            this.name = getName;
            this.owner = nameOwner;
            this.adress = adressOwner;
            this.breed = getBreed;
            this.id = getId;
        }

        public String getName(){
            return this.name;
        }
        // показать кота
        public String toString() {
            return String.format("id %d Кличка %s, ФИО владельца %s", id, name, owner);
        }
        
        // добавить прививку
        // добавить обращение и лечение
        
        // сравнить котов
        public boolean equals(Object o) {
            var t = (Cat) o;
            return id == t.id && name == t.name;
        }
    
        public void currentWeight(double mass) {    // взвесить
            this.weight = mass;
        }

        public void getWeight() {          // узнать вес
            System.out.printf("Вес: %.2f кг\n", this.weight);
        }

        public void getAge() {          // узнать возраст
            System.out.printf("коту %s %d лет \n", this.name, this.age);
        }

        public void addChip() {         // добавить чип
            if(this.catChip) {
                System.out.printf(" %s уже чипирован \n", this.name);
            }
            else{
                this.catChip = true;
                System.out.printf("теперь %s чипирован \n", this.name);
            }
        }

    }
    public static void main(String[] args) {
        Cat bars = new Cat("Барсик" ,"Иванов Сергей", "Уфа", "Мейнкун", 1);
        System.out.println(bars.toString());
        bars.currentWeight(13.5);
        bars.getWeight();

        Cat moor = new Cat("Мурзик" ,"Петров Сергей", "Уфа", "Британец", 2);
        System.out.println(moor.toString());
        System.out.println(moor.weight);
        System.out.println(moor.getName());
    }
}