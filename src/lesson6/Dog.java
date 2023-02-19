package lesson6;

class Dog extends Animal{
    Dog (String name, String color, int age) {

        super(name, color, age);
    }
    @Override
    public String voice() {
        return "гав-гав";
    }

    @Override
    public String run() {
        return "Собака может пробежать 500м";
    }

    @Override
    public String swim() {
        return "Собака может проплыть 10м";
    }
}
