package Lesson2;

import java.util.Scanner;

public class Task3 {

    int a; // количество столбцов
    int b; // количество строк
    static String name;

    public static void main(String [] args) {

        String name = "O";

        Scanner s = new Scanner(System.in);
        Scanner d = new Scanner(System.in);

        System.out.print("Введите количество строк = ");
        int a = s.nextInt();

        System.out.print("Введите количество столбцов = ");
        int b = d.nextInt();

        String [][] matrice = new String[a][b];

        for (a = 0; a< matrice.length; a++){
            for (b = 0; b< matrice[a].length; b++){
                System.out.print(name + " ");
            }
            System.out.println();
        }
        System.out.println("Построенние массива закончено");
    }

}
