package Lesson2;

public class Task2 {

    public static void main(String[] args) {

        byte a = 127;
        short b = 1513;
        int c = 1221;
        float d = 77.0f;
        double e = 315.0;

        System.out.println("Byte имеет значение  \"A\" = " + a);
        System.out.println("Short имеет значение \"B\" = " + b);
        System.out.println("Int имеет значение \"C\" = " + c);
        System.out.println("Float имеет значение \"D\" = " + d);
        System.out.println("Double имеет значение \"E\" = " + e);

        int a1 = a - c;
        System.out.println("Полученная переменная \"int A1\" = " + a1);
        float b1 = b / d;
        System.out.println("Полученная переменная \"float D1\" = " + b1);
        double c1 = d * e;
        System.out.println("Полученная переменная \" double C1\" = "+c1);
        short d1 = (short) (b + a);
        System.out.println("Полученная переменная \"short D1\" = "+d1);
        double e1 = c % e;
        System.out.println("Полученная переменная \"double E1\" = "+e1);
    }
}