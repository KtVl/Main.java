package lesson7;

public class Cat {
    private String name;
    private int appetite;

    Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    void eat(Plate p) { //в метод передавем ссылку на тарелку. р = объект типа Plate
        p.decreaseFood(appetite);

    }

//    int getAppetite() {
//        return appetite;
//    }

    @Override
    public String toString() {
        return "кот: " + name + ", аппетит: " + appetite;
    }
}
