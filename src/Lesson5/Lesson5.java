package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
// вызвать статический метод не создавая объекта. через имя класса
//        System.out.println(Cat.voice());
// создаем ссылочную переменную = создание объекта
        Cat cat = new Cat("Саня", "black", 2);
        Cat cat1 = new Cat("Kotik", "black", 28);
        System.out.println(cat.getName()); // вызов метода гет
        System.out.println(cat1);
        cat.setName("Barsik");
        System.out.println(cat.voice()); // вызываем метод у объекта
        System.out.println(cat); //выводим объект после переопределения
    }
}
