package lesson3;

import java.util.Objects;
import java.util.Scanner;

public class Computer {

    String type;
    String brand;
    String model;
    double cost;
    int maxWorkingCount;
    Cpu cpu;
    Ram ram;
    Driver driver;

    public Computer(String type, String brand, String model, double cost, int maxWorkingCount,Cpu cpu, Ram ram, Driver driver){
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.maxWorkingCount = maxWorkingCount;
        this.cpu = cpu;
        this.ram = ram;
        this.driver = driver;
    }
    public static int getRandomDiceNumber(){
        return (int) (Math.random() * 2);
    }
    public static void onOff(int maxWorkingCount){
        boolean supply = false;
        int on;
        int off;
        while (maxWorkingCount > 0){
            if (!supply){
                System.out.println("Компьютер №1 выключен, чтобы запустить его, введите \"1\" или \"0\" : ");
                Scanner newon = new Scanner(System.in);
                on = newon.nextInt();
                if (on>=2||on<=-1){
                    System.out.println("! ! ! Введено неккоректное значение ! ! !");
                    System.out.println();
                }
                else {
                    int value = getRandomDiceNumber();
                    System.out.println(value);
                    System.out.println("Разрешение запуска : " + value);
                    if (value == on ){
                        --maxWorkingCount;
                        System.out.println("Поздравляем, компьютер запущен" +"\n"
                                + "Количество доступных запусков = " + maxWorkingCount);
                    }
                    else {
                        maxWorkingCount = 0;
                        System.out.println("Сожалеем, Ваш компьютер не работоспособен" + "\n"
                                + "Количество доступных запусков = " + maxWorkingCount);
                    }
                    supply = true;
                }
            }
            else {
                System.out.println("Компьютер №1 включен, чтобы выключить его, введите \"1\" или \"0\" : ");
                Scanner newoff = new Scanner(System.in);
                off = newoff.nextInt();
                if (off>=2||off<=-1){
                    System.out.println("! ! ! Введено неккоректное значение ! ! !");
                    System.out.println();
                }
                else {
                    int value = getRandomDiceNumber();
                    System.out.println(value);
                    System.out.println("Разрешение выключения : " + value);
                    if (value == off ){
                        --maxWorkingCount;
                        System.out.println("Поздравляем, компьютер выключен" +"\n"
                                + "Количество доступных запусков = " + maxWorkingCount);}
                    else {maxWorkingCount = 0;
                        System.out.println("Сожалеем, Ваш компьютер не работоспособен" + "\n"
                                + "Количество доступных запусков = " + maxWorkingCount);}
                    supply = false;
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Компьютер { " +
                "Тип = " + type +
                ", Бренд = " + brand +
                ", Модель = " + model +
                ", Цена = " + cost + "$" +
                ", Максимальное количество вкллючений = " + maxWorkingCount +
                '}' + "\n" + cpu + "\n" + ram+ "\n" + driver;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(brand, computer.brand);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, cost);
    }
}
