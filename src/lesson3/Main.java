package lesson3;

public class Main {

    public static void main(String[] args) {
        Computer firstPc = new Computer("Desktop", "Skynet", "T-800",
                459.99, 100,
                new Cpu(3, 6, 12),
                new Ram(8, "DDR3"),
                new Driver(512, "HDD","ADATA"));
        System.out.println("1-ый созданный компьютер:" +"\n" + firstPc);
        System.out.println();
        Computer secondPc = new Computer("Desktop", "Skynet", "T-1000",
                599.99, 1000,
                new Cpu(4, 8, 6),
                new Ram(4, "DDR4"),
                new Driver(256, "SSD","WD"));
                System.out.println("2-ой созданный компьютер:" + "\n" + secondPc);
                System.out.println();

        System.out.println("Совпадение брендов = " + firstPc.brand.equals(secondPc.brand));
        System.out.println("Артикул первого компьютера = " + firstPc.hashCode());
        System.out.println("Артикул второго компьютера = " + secondPc.hashCode());
        System.out.println();
        Computer.onOff(firstPc.maxWorkingCount);
    }
}

