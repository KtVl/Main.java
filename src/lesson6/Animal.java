package lesson6;

abstract class Animal implements IAnimal{
    protected String name;
    protected String color;
    protected int age;


    // конструктор
    Animal (String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // переопределение метода
    @Override
    public String toString() {
        return name + ", " + color + ", " + age;
    }
}
