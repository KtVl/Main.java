package lesson5;

public class Cat {
    private String name;
    private String color;
    private int age;


    // конструктор
     Cat (String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // метод гет для чтения поля name
    public String getName() {
         return name;
    }

    // метод сет для изменения поля name
    public void setName(String name){
         if (name != null) { //защита от зануления
             this.name = name;
         }
    }

    String voice() {
        return "мяяяяяяу";
    }

   // переопределение метода
    @Override
    public String toString() {
        return name + ", " + color + ", " + age;
    }
}
