package Lesson6;

class Dog extends Animal{
    Dog (String name, String color, int age) {

        super(name, color, age);
    }
    @Override
    String voice() {
        return "гав-гав";
    }
}
