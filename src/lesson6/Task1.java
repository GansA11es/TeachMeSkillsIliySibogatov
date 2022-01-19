package lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("src/lesson5/input");
        File output = new File ("src/lesson5/output");
        Scanner scanner = new Scanner(input);
        PrintWriter pw = new PrintWriter(output);
        String line = scanner.nextLine();
        String [] numbersString = line.split(" ");
        scanner.close();
        int [] numbersIn = new int [10];
        int [] numbersOut = new int[10];
        int i = 0;
        for (String number : numbersString){
            numbersIn [i] = Integer.parseInt(number);
            numbersOut[i] = Integer.parseInt(number)*10;
            i++;
        }
        System.out.print(Arrays.toString(numbersIn));
        System.out.println();
        System.out.print(Arrays.toString(numbersOut));
        pw.print(Arrays.toString(numbersOut));
        pw.close();
    }
}