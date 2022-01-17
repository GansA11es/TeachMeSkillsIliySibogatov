package Lesson2;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите допустимое значение byte = ");
    byte a = scanner.nextByte();
    System.out.print("Введите допустимое значение short = ");
    short b = scanner.nextShort();
    System.out.print("Введите допустимое значение int = ");
    int c = scanner.nextInt();
    if (a == b && b == c)
        System.out.println("Все числа равны!");
    else threeMaxMinAverage(a,b,c);
    }
    public static void threeMaxMinAverage(int a, int b, int c){

    int firstCouple = maxTwoNumber(a, b);
    int secondCouple = maxTwoNumber(a, c);
    int bigNumber = maxTwoNumber(firstCouple,secondCouple);
    System.out.println("Наибольшее из введённых чисел = " + bigNumber);

    firstCouple = minTwoNumber(a,b);
    secondCouple = minTwoNumber(a,c);
    int smallNumber = minTwoNumber(firstCouple,secondCouple);
    System.out.println("Наименьшее из введённых чисел = " + smallNumber);

    firstCouple = maxTwoNumber(a,b);
    secondCouple = maxTwoNumber(c,b);
    int thirdCouple = maxTwoNumber(a,c);
    firstCouple = minTwoNumber(firstCouple,secondCouple);
    secondCouple = minTwoNumber(thirdCouple,secondCouple);
    int averangeNumber = minTwoNumber(firstCouple,secondCouple);
    System.out.println("Среднее из введённых чисел = " + averangeNumber);
    }
    public static int maxTwoNumber (int a, int b){
        if (a > b){
            return a;
        } else return b;
    }
    public static int minTwoNumber (int a, int b){
        if (a < b){
            return a;
        } else return b;
    }
}