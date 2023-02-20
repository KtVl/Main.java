package lesson7;

public class Plate {
    private  int food;

    Plate(int food) {
        this.food = food;
    }


    //кот ест с помощью геттера и сеттера
//    int getFood() {
//        return food;
//    }
//
//    void setFood(int food) {
//        this.food = food;
//    }

    // второй вариант через метод
    void decreaseFood(int food){
        this.food -= food;
    }

    @Override
    public String toString() {
        return "тарелка: " + food;
    }
}
