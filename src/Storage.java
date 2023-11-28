public class Storage {
    private final StorageType type; // Тип носителя
    private final int volume; // Обьем памяти
    private final double weight; // Вес

    public Storage(StorageType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;


    }

    public StorageType getType() {
        return type;
    }

    public Storage setType(StorageType type) {
        return new Storage(type, this.volume, this.weight);
    }

    public int getVolume() {
        return volume;
    }

    public Storage setVolume(int volume) {
        return new Storage(this.type, volume, this.weight);
    }

    public double getWeight() {
        return weight;
    }

    public Storage setWeight(double weight) {
        return new Storage(this.type, this.volume, weight);
    }


    public String toString() {
        return "Накопитель информации: " +
                "\n\t Тип: " + type +
                "\n\t Обьем памяти: " + volume +
                "\n\t Вес: " + weight;
    }




}
