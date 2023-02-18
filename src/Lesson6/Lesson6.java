package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        IAnimal[] animals = {
                new Cat("Саня", "black", 2),
                new Dog("Семён", "опал", 11)
        };
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice()); // через один и тот же интерфейс доступ к разным реализациям
            System.out.println(animal.run());
            System.out.println(animal.swim());
        }
    }
}
