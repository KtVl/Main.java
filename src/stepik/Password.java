package stepik;
import java.util.Scanner;

public class Password {
    // Напишите программу, которая:
    //запрашивает на вход число-пароль
    //если оно равно секретному числу, программа выводит: "Hello, Agent"
    //в противном случае печатает: "Access denied".
    //Секретный пароль хранится в final static int password.
    final static int PASSWORD = 133976;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PASSWORD = sc.nextInt();
        int pass = 133976;
        if (PASSWORD == pass){
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
