package Homework6;
   /*   1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть.
        В качестве параметра каждому методу передается длина препятствия.
        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия
        (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. * Добавить подсчет созданных котов, собак и животных.

    */
public class Homework6 {
    public static void main(String[] args) {
        InterfaceAnimal[] animals = {
                new Cats(200, 0),
                new Cerber(500, 10)
        };
        for (InterfaceAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.swim(25));
            System.out.println(animal.swim(6));
        }
        System.out.println(" всего животных выжило: " + Animal.getCount());
    }
}
