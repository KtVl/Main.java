package lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 5);
        System.out.println(cat);

        Plate plate = new Plate(10);
        System.out.println(plate);

        //теперь накормим кота
//        plate.setFood(plate.getFood() - cat.getAppetite()); //колво еды(от геттера отнимем аппетит)
//        plate.decreaseFood(cat.getAppetite()); // убавим еду через метод
        cat.eat(plate); // третий вариант убавления еды
        System.out.println(plate); //после выведем состояние тарелки
    }

}
