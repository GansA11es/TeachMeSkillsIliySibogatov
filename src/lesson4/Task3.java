package lesson4;
import java.util.HashMap;
import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {
        arabAndRomane();
        arabDivision();
    }
    private static HashMap arabAndRomane () {
        HashMap<Integer, String> arabRomane = new HashMap<>();
        arabRomane.put(0, "0");
        arabRomane.put(1, "I");
        arabRomane.put(5, "V");
        arabRomane.put(10, "X");
        arabRomane.put(50, "L");
        arabRomane.put(100, "C");
        return arabRomane;
    }
    public static int arabNumber(){
        Scanner getArab = new Scanner(System.in);
        System.out.print("Введите арабское число = ");
        return getArab.nextInt();
    }
    public static void arabDivision(){
        int in = arabNumber();
        int c1 = in / 100;  //Выделяем кратного 100
        int c2 = in % 100;  //Выделение остатки
        int l1 = c2 / 50;   //Выделение кратного 50
        int l2 = c2 % 50;   //Выделение остатка
        int x1 = l2 / 10;   //Выделение кратного 10
        int x2 = l2 % 10;   //Выделение остатка
        int v1 = x2 / 5;    //Выделение кратного 5
        int v2 = x2 % 5;    //Выделение остатка
        arabTranslation(c1, l1, x1, x2, v1, v2);
    }
    public static void arabTranslation(int c1, int l1, int x1, int x2, int v1, int v2) {
        StringBuilder romanNum = new StringBuilder();
        int i;
        if ( c1 == 4 ) romanNum.append("CD");
        else if ( c1 < 4) {
            for ( i=0; i < c1; i ++ )
                romanNum.append(arabAndRomane().get(100));}
        if ( l1 == 1) romanNum.append(arabAndRomane().get(50));
        if ( x1 == 9 ) romanNum.append("XC");
        else if ( x1 == 4 ) romanNum.append("XL");
        if ( x1 < 4 ) {
            for ( i = 0; i < x1; i ++ )
                romanNum.append(arabAndRomane().get(10));}
        if ( x2 == 9 ) romanNum.append("IX");
        else if ( v1 == 1 ) romanNum.append(arabAndRomane().get(5));
        else if ( v2 == 4 ) romanNum.append("IV");
        if ( v2 < 4 ) {
            for ( i = 0; i < v2; i ++)
                romanNum.append(arabAndRomane().get(1));}
        if ( c1 == 0 && l1 == 0 && x1 == 0 && x2 == 0 && v1 == 0 && v2 ==0)
            romanNum.append(arabAndRomane().get(0));
        System.out.println(romanNum);
    }
}