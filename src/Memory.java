public class Memory {
    private final MemoryType type; // Тип памяти
    private final int volume; // Обьем памяти
    private final double weight; // Вес

    public Memory(MemoryType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;

    }

    public MemoryType getType() {
        return type;
    }

    public Memory setType(MemoryType type) {
        return new Memory(type, this.volume, this.weight);
    }

    public int getVolume() {
        return volume;
    }

    public Memory setVolume(int volume) {
        return new Memory(this.type, volume, this.weight);
    }

    public double getWeight() {
        return weight;
    }

    public Memory setWeight(double weight) {
        return new Memory(this.type, this.volume, weight);
    }

    public String toString() {
        return "Оперативная память: " +
                "\n\t Тип: " + type +
                "\n\t Обьем: " + volume +
                "\n\t Вес: " + weight;
    }


}
