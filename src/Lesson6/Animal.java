package Lesson6;

abstract class Animal {
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


    abstract String voice();

    // переопределение метода
    @Override
    public String toString() {
        return name + ", " + color + ", " + age;
    }
}
