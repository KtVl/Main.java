package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
         Cat cat = new Cat("Саня", "black", 2);
         Dog dog = new Dog("Семён", "опал", 11);
         System.out.println(cat);
         System.out.println(cat.voice());
         System.out.println(dog);
         System.out.println(dog.voice());
    }
}
