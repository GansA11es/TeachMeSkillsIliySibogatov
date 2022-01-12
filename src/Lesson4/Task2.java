package Lesson4;

public class Task2 {
    /** задача выводит на экран минимальное число из 4 {14, 11, 10, 15}
     * getMinFromFour - из 4 чисел
     * getMinFromTwo - из 2 чисел
     * Тут есть ошибка. Работает не правильно. При помощи отладчика (Debug) найти и исправить ошибку.
     **/

    public static void main(String[] args) {
        int minFromFour = getMinFromFour(14, 11, 10, 15);
        System.out.println("Минимальное значение из четырёх = " + minFromFour);
        int minFromTwo = getMinFromTwo(14 ,11);
        System.out.println("Минимальное значение из двух = " + minFromTwo);
    }
    public static int getMinFromFour(int a, int b, int c, int d) {
        int firstPairResult = getMinFromTwo(a, b);
        int secondPairResult = getMinFromTwo(c, d);
        return getMinFromTwo(firstPairResult, secondPairResult);
    }
    public static int getMinFromTwo(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
