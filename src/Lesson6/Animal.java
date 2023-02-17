package Lesson6;

public class Animal {
    public String voice;
    protected String name;
    protected String color;
    protected int age;


    // конструктор
    Animal (String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    String voice() {
        return "unknown";
    }

    // переопределение метода
    @Override
    public String toString() {
        return name + ", " + color + ", " + age;
    }
}
