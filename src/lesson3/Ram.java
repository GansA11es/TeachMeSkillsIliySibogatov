package lesson3;

public class Ram {
    int capacity;
    String type;

    public Ram(int capacity, String type){
        this.capacity = capacity;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Оперативная память { " +
                "Объём =  " + capacity + "Гб" +
                ", Тип памяти = " + type +" " +
                '}';
    }
}
