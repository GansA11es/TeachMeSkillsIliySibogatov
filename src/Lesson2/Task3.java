package Lesson2;

import java.util.Scanner;

public class Task3 {

    public static void main(String [] args) {

        String name = "O";

        Scanner s = new Scanner(System.in);
        Scanner d = new Scanner(System.in);

        int a; // количество столбцов
        int b;// количество строк
        System.out.print("Введите количество строк = ");
        a = s.nextInt();

        System.out.print("Введите количество столбцов = ");
        b = d.nextInt();

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print(name + " ");
            }
            System.out.println();
        }
        System.out.println("Построенние массива закончено");
    }
}
