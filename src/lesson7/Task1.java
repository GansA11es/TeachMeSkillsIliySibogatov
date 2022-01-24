package lesson7;

import java.io.*;
import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        summatorNumber();
    }
    public static String readInput() {
        int inputNum = 0;
        try (FileInputStream input = new FileInputStream
            ("C:/Users/iliy_/IdeaProjects/" + "TeachMeSkillsIliySibogatov/src/lesson7/input")) {
            StringBuilder adder = new StringBuilder();
            while ((inputNum = input.read()) != -1) {
                if (adder.indexOf(" -1 ") != -1) {
                    break;
                }
                adder.append((char) inputNum);
            }
        System.out.println(adder);
            return adder.toString();}
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void summatorNumber(){
        String [] numArray = readInput().split(" ");
        ArrayList <Integer> numbers = new ArrayList<>();
            for (String number : numArray){
                numbers.add(Integer.parseInt(number));
            }
        int summ = 0;
        for (Integer number : numbers) {
            summ += number;
        }
        System.out.println(summ);
    }
}