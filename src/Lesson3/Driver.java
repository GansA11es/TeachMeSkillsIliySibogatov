package Lesson3;

public class Driver {
    public int capacity;
    public String type;
    public String brand;

    public Driver (int capacity, String type, String brand) {
        this.capacity = capacity;
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Накопитель {" +
                "Объём = " + capacity + " " + "Гб" +
                ", Тип = " + type +
                ", Бренд = " + brand + " " +
                '}';
    }
}
