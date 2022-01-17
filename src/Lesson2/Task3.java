package Lesson2;
import java.util.Scanner;

public class Task3 {

    public static void main(String [] args) {
        String name = "O";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк = ");
        int a = scanner.nextInt();
        System.out.print("Введите количество столбцов = ");
        int b = scanner.nextInt();
        for (int i = 0; i < a; i++){
            for (int j = 0; j< b; j++){
                System.out.print(name + " ");
            }
            System.out.println();
        }
        System.out.println("Построенние массива закончено");
    }
}
