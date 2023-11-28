public class Keyboard {
    private final KeyboardType type; // Тип клавиатуры
    private final String hasBacklight; // Наличие подстветки
    private final double weight; // Вес


    public Keyboard(KeyboardType type, String hasBacklight, double weight) {
        this.type = type;
        this.hasBacklight = hasBacklight;
        this.weight = weight;

    }

    public KeyboardType getType() {
        return type;
    }

    public Keyboard setType(KeyboardType type) {
        return new Keyboard(type, this.hasBacklight, this.weight);
    }

    public String isHasBacklight() {
        return hasBacklight;
    }

    public Keyboard setHasBacklight(String hasBacklight) {
        return new Keyboard(this.type, hasBacklight, this.weight);
    }

    public double getWeight() {
        return weight;
    }

    public Keyboard setWeight(double weight) {
        return new Keyboard(this.type, this.hasBacklight, weight);
    }

    public String toString() {
        return "Клавиатура: " +
                "\n\t Тип: " + type +
                "\n\t Подсветка: " + hasBacklight +
                "\n\t Вес: " + weight;
    }


}
