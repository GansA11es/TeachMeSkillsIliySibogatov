package Lesson4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Введите возраст спортсмена : ");
        int age = a.nextInt();

        switch (( age >= 7 && age <= 13 ) ? 1 :
                ( age >= 14 && age <= 17 ) ? 2 :
                ( age >= 17 && age <= 65 ) ? 3 :
                ( age < 0 ) ? 0 : -1 ) {
            case 0:
                System.out.println("Возраст введен не корректно");
                break;
            case 1:
                System.out.println("Подходящая возрастная группа : 1 ");
                break;
            case 2:
                System.out.println("Подходящая возрастная группа : 2 ");
                break;
            case 3:
                System.out.println("Подходящая возрастная группа : 3 ");
                break;
            case -1:
                System.out.println("Подходящая возрастная группа : -1 ");
                break;
        }
    }
}
