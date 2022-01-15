package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {



    public static int getRandomDiceNumber(){
        return (int) (Math.random() * 2);
    }

    public static void main(String[] args) {

        Random rand = new Random();
        boolean supply = false;
        int on;
        int off;
        int workingCount;

        Cpu cpuOne = new Cpu(3,6,12);
        Ram ramOne = new Ram(8, "DDR3");
        Driver driverOne = new Driver(512, "hdd", "ADATA");
        Computer pcOne = new Computer("Настольный", "SkyNet", "T-800",
                459.99,100);

        System.out.println("1-ый созданный компьютер:\n" + pcOne + "\n" + cpuOne + "\n" +
                ramOne + "\n" + driverOne);
        System.out.println();

        Computer pcTwo = new Computer("Настольный", "SkyNet", "T-1000", 559.99,1000);
        Cpu cpuTwo = new Cpu(4,8,6);
        Ram ramTwo = new Ram(4, "DDR4");
        Driver driverTwo = new Driver(256, "ssd", "WD");
        System.out.println("2-ой созданный компьютер:" + "\n" + pcTwo + "\n" + cpuTwo + "\n" + ramTwo + "\n" + driverTwo);
        System.out.println();

        System.out.println("Совпадение брендов = " + pcOne.equals(pcTwo));
        System.out.println("Артикул первого компьютера = " + pcOne.hashCode());
        System.out.println("Артикул второго компьютера = " + pcTwo.hashCode());
        System.out.println();

        workingCount = pcOne.maxWorkingCount;

        pcTwo.turnOn();

        while (workingCount > 0){
            if ( !supply ){
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
                            --workingCount;
                            System.out.println("Поздравляем, компьютер запущен" +"\n"
                                                + "Количество доступных запусков = " + workingCount);
                            }
                            else {
                            workingCount = 0;
                            System.out.println("Сожалеем, Ваш компьютер не работоспособен" + "\n"
                                            + "Количество доступных запусков = " + workingCount);
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
                                workingCount = --workingCount;
                                System.out.println("Поздравляем, компьютер выключен" +"\n"
                                                    + "Количество доступных запусков = " + workingCount);}
                            else {workingCount = 0;
                                System.out.println("Сожалеем, Ваш компьютер не работоспособен" + "\n"
                                                    + "Количество доступных запусков = " + workingCount);}
                    supply = false;
                    }
            }
        }
    }
}

