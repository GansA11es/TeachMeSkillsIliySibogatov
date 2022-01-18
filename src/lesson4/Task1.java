package lesson4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст спортсмена : ");
        int age = scanner.nextInt();
        if ( age < 0 ) System.out.println("Возраст введен не корректно");
        else if ( age >= 7 && age <= 13 ) System.out.println("Подходящая возрастная группа : 1 ");
        else if ( age >= 14 && age <= 17 ) System.out.println("Подходящая возрастная группа : 2 ");
        else if ( age >= 17 && age <= 65 ) System.out.println("Подходящая возрастная группа : 3 ");
        else System.out.println("Подходящая возрастная группа : -1 ");
    }
}
