package lesson6;

class Cat extends Animal{
    Cat (String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public String voice() {
        return "мяяяяу";
    }

    @Override
    public String run() {
        return "Кот может пробежать 200м";
    }

    @Override
    public String swim() {
        return "Кот не умеет плавать";
    }
}

