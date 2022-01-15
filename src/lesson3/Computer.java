package lesson3;

import java.util.Objects;

public class Computer {

    Cpu cpu;
    Driver driver;
    Ram ram;
    String type;
    String brand;
    String model;
    double cost;
    int maxWorkingCount;

    public Computer(String type, String brand, String model, double cost, int maxWorkingCount){
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.maxWorkingCount = maxWorkingCount;
    }

    @Override
    public String toString() {
        return "Компьютер { " +
                "Тип = " + type +
                ", Бренд = " + brand +
                ", Модель = " + model +
                ", Цена = " + cost + "$" +
                ", Максимальное количество вкллючений = " + maxWorkingCount +
                '}';
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
