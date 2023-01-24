package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    Random random; // ссылочные переменные
    Scanner scanner;
    char[][] table;
    public static void main(String[] args) {
        new TicTacToe().game();   // создали объект. через точку вызвали метод

    }
    TicTacToe () { // конструктор, в кот инициализируются поля
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }
    void game() { // в этом методе расписана вся логика игры
        initTable();
        printTable();
        while (true) {   // бесконечный цикл
            turnHuman(); // метод ход человека
            if (checkWin('x')) {   // прверяем не произошла ли победа
                System.out.println("Ты победил!");
                break;
            }
            if (isTableFull()) { // проверка на ничью
                System.out.println("Ничья!");
                break;
            }
            turnAI();
            printTable();
            if (checkWin('o')) {   // прверяем не произошла ли победа
                System.out.println("Ты проиграл, лошара!");
                break;
            }
            if (isTableFull()) { // проверка на ничью
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("GAME OVER!");
        printTable();
    }
    void initTable() { //метод создания таблицы
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                table[x][y] = '.';
            }
        }
    }
    void printTable() { // печать таблицы
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }
    void turnHuman() { // ход человека
        int x, y;
        do {
            System.out.println("введите координаты Х (столбец) и У(строка) через пробел "); // вводим координаты через пробел
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellVallid(x, y)); // в случает занятой ячейки цикл повторится
        table[x][y] = 'x';
    }
    void turnAI() { // ход компуктера
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellVallid(x, y)); // в случае занятой ячейки цикл повторится
        table[x][y] = 'o';
    }
    boolean checkWin(char ch) { // проверка на победу
        // проверка вертикали и горизонтали
        if (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        if (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;
        //
        if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;
        // проверка диагонали
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }
    boolean isTableFull() { // проверка заполнена ли вся таблица
            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {
                    if (table[x][y] == '.') {
                        return false;
                    }
                }
            }
            return true;
    }
    boolean isCellVallid(int x, int y) { // служебн метод. проверка является ли ячейка свободной
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return  table[x][y] == '.';
    }
}
