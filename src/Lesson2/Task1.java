package Lesson2;

import java.util.Scanner;
public class Task1 {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        byte a;
        short b;
        int c;
        int minimum = 0;
        int middle = 0;
        int maximum = 0;

        System.out.print("Введите допустимое значение byte = ");
        a = SCANNER.nextByte();
        System.out.print("Введите допустимое значение short = ");
        b = SCANNER.nextShort();
        System.out.print("Введите допустимое значение int = ");
        c = SCANNER.nextInt();


        if (a == b && b == c) {
            System.out.println("Все три числа равны");
            minimum = a;
            middle = a;
            maximum = a;
        }
        else if (a>b && b>c) {minimum = c; middle = b; maximum = a;}
        else if (a>c && c>b) {minimum = b; middle = c; maximum = a;}
        else if (b>a && a>c) {minimum = c; middle = a; maximum = b;}
        else if (b>c && c>a) {minimum = a; middle = c; maximum = b;}
        else if (c>a && a>b) {minimum = b; middle = a; maximum = c;}
        else if (c>b && b>a) {minimum = a; middle = b; maximum = c;}
        else if (a==b && a>c) {minimum = c; middle = c; maximum = a;}
        else if (a==b && a<c) {minimum = a; middle = b; maximum = c;}
        else if (b==c && b>a) {minimum = a; middle = c; maximum = b;}
        else if (b==c && b<a) {minimum = b; middle = c; maximum = a;}
        else if (c==a && c>a) {minimum = a; middle = b; maximum = c;}
        else if (c==a && c<a) {minimum = c; middle = b; maximum = a;}
        else if (c==a && c>b) {minimum = b; middle = b; maximum = c;}
        else if (c==a && c<b) {minimum = c; middle = c; maximum = b;}

        System.out.println("Наименьшее из введённых чисел:"+ minimum);
        System.out.println("Среднее из введённых чисел:"+ middle);
        System.out.println("Наибольшее из введённых чисел:"+ maximum);
    }
}
