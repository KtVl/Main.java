package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Саня", "black", 2),
                new Dog("Семён", "опал", 11)
        };
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice()); // через один и тот же интерфейс доступ к разным реализациям
        }
    }
}
