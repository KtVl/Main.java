package lesson7;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        final long COUNT = 512_000;

        //using String
        long startTime = System.currentTimeMillis(); //засекаем время
        String str = ""; //создаем пустую строку
        for (int i = 0; i < COUNT; i++) {
            str += "x";
        }
        System.out.println("String: " + (System.currentTimeMillis() - startTime)); //увидим кол-во милисекунд, кот заняла каждая операция

        //using String Builder
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder(); //создаем пустую строку
        for (int i = 0; i < COUNT; i++) { //добавляем символ с помощью метода
            builder.append("x");
        }
        System.out.println("String Builder: " + (System.currentTimeMillis() - startTime));
    }
}
