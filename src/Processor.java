import java.util.Random;

public class Processor {
    private final double frequency; // Частота
    private final int cores; // Колличество ядер
    private final ProcessorType model; // Производитель
    private final double weight; // Вес

    public Processor(double frequency, int cores, ProcessorType model, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.model = model;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public Processor setFrequency(double frequency) {
        return new Processor(frequency, this.cores, this.model, this.weight);
    }

    public int getCores() {
        return cores;
    }

    public Processor setCores(int cores) {
        return new Processor(this.frequency, cores, this.model, this.weight);
    }

    public ProcessorType getModel() {
        return model;
    }

    public Processor setModel(ProcessorType model) {
        return new Processor(this.frequency, this.cores, model, this.weight);
    }

    public double getWeight() {
        return weight;
    }

    public Processor setWeight(double weight) {
        return new Processor(this.frequency, this.cores, this.model, weight);
    }

    public String toString() {
        return "Процессор: " +
                "\n\t Частота: " + frequency +
                "\n\t Количество ядер: " + cores +
                "\n\t Производитель: " + model +
                "\n\t Вес: " + weight;
    }

}
