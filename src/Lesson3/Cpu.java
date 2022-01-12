package Lesson3;

public class Cpu {
    int frequency;
    int coreCount;
    int cacheSize;

    public Cpu(int frequency, int coreCount, int cacheSize) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.cacheSize = cacheSize;
    }

    @Override
    public String toString() {
        return "Процессор { " +
                "Тактовая частота = " + frequency + " " + "ГГц" +
                ", Количество ядер = " + coreCount +
                ", Размер кэш = " + cacheSize +" "+ "Мб" + " " +
                '}';
    }
}
