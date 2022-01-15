package Lesson2;

public class Task4 {

    public static void main(String[] args) {

        int b = 0b100101;  // 37;
        int c = 0b111111; // 63;
        System.out.println("Значение b = " + b);
        System.out.println("Значение c = " + c);

        int a1 = b + c;
        System.out.println("Сложение : a1 = " + a1);
        int a2 = b - c;
        System.out.println("Вычитание : a2 = " + a2);
        int a3 = b * c;
        System.out.println("Умножение : a3 = " + a3);
        double a4 = b / c;
        System.out.println("Деление : a4 = " + a4);
        double a5 = b % c;
        System.out.println("Получение остатка : a5 = " + a5);
        int b1 = 0b0101; // 5;
        int a6 = ++b1;
        System.out.println("Префиксный инкремент : a6 =" + a6 + " ; " + "b1 = " + b1);
        int b2 = 0b0111; // 7;
        int a7 = b2++;
        System.out.println("Постфиксный инкремент : a7 =" + a7 + " ; " + "b2 = " + b2);
        int b3 = 0b1010; // 10;
        int a8 = --b3;
        System.out.println("Префиксный декремент : a8 =" + a8 + " ; " + "b3 = " + b3);
        int b4 = 0b10000; // 16;
        int a9 = b4--;
        System.out.println("Постфиксный декремент : a9 =" + a9 + " ; " + "b4 = " + b4);
        boolean a10 = b == c;
        System.out.println("Равентсво \"b\" и \"c\" : a10 = " + a10);
        boolean a11 = b != c;
        System.out.println("Неравентсов \"b\" и \"c\" : a11 = " + a11);
        boolean a12 = b < c;
        System.out.println("\"c\" больше \"b\" : a12 = " + a12);
        boolean a13 = b > c;
        System.out.println("\"b\" больше \"c\" : a13 = " + a13);
        boolean a14 = b <= c;
        System.out.println("\"c\" больше или равено \"b\" : a14 = " + a14);
        boolean a15 = b >= c;
        System.out.println("\"b\" больше или равно  \"c\" : a15 = " + a15);
        boolean a16 = (b==c) | (b > c);
        System.out.println("Сравнение \"b | c\" : a16 = " + a16);
        boolean a17 = b >= c;
        System.out.println("Сравнение \"b & c\" : a17 = " + a17);
        boolean e = false;
        boolean f = true;
        boolean a18= f != e ;
        System.out.println("Ложность \"e\" : a18 = " + a18);
        boolean a19 = e ^ f;
        System.out.println("Сравнение \"e ^ f\" : a19 = " + a19);
        boolean a20 = e || f;
        System.out.println("Сравнение \"e || f\" : a20 = " + a20);
        boolean a21 = e && f;
        System.out.println("Сравнение e && f : : a21 = " + a21);
        int a22 = b;
        System.out.println("Присвоение а22 числа b : a22 = " + a22);
        int a23 = b +=c ;
        System.out.println("Присвоение суммы \"b и c\" : a23 = " + a23);
        int a24 = b -= c;
        System.out.println("Присвоение разности \"b и c\"  : a24 = " + a24);
        int a25 = b *= c;
        System.out.println("Присвонение произведения \"b и c\" : a21 = " + a25);
        int a26 = b /= c;
        System.out.println("Присвонение результата деления \"b и c\" : a21 = " + a26);
        int a27 = b %= c;
        System.out.println("Присвонение остатка \"b и c\" : a27 = " + a27);
        int a28 = b &= c;
        System.out.println("Присвонение значение \"b &= c\" : a28 = " + a28);
        int a29 = b |= c;
        System.out.println("Присвонение значение \"b |= c\" : a29 = " + a29);
        int b5 = 0b1010001;//70
        int a30 = b5 ^= c;
        System.out.println("Присвонение значение \"b5 ^= c\" : a30 = " + a30);
        int a31;
        a31 = b5 <<= 1;
        System.out.println("Присвонение значение \"<<= b5\" : a31 = " + a31);
        int a32;
        a32 = b5 >>= 1;
        System.out.println("Присвонение значение \">>= b5\" : a32 = " + a32);
        int a33;
        a33 = b5 >>>= 1;
        System.out.println("Присвонение значение \">>>= b5\" : a33 = " + a33);
    }
}