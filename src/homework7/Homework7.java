package homework7;

public class Homework7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("First", 15), new Cat("Second", 10), new Cat("third", 20)
        };

        Plate plate = new Plate(50,30);
        System.out.println(plate);

        // коты начинают есть из тарелки и выводят свое состояние
        for (Cat cat : cats){
            cat.eat(plate);
            System.out.println(cat);
        }

        // выводим состояние тарелки посмотреть сколько коты поели и добавляем 40 ед еды
        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);

        // коты снова едят
        for (Cat cat : cats) {
            cat.setFullness(false); // сделать котов голодными
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}
