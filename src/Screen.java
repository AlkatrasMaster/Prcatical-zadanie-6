public class Screen {
    private final ScreenType type; // Тип экрана
    private final int diagonal; // Диагональ
    private final double weight; // Вес

    public Screen(ScreenType type, int diagonal, double weight) {
        this.type = type;
        this.diagonal = diagonal;
        this.weight = weight;

    }

    public ScreenType getType() {
        return type;
    }

    public Screen setType(ScreenType type) {
        return new Screen(type, this.diagonal, this.weight);
    }

    public int getDiagonal() {
        return diagonal;
    }

    public Screen setDiagonal(int diagonal) {
        return new Screen(this.type, diagonal, this.weight);
    }

    public double getWeight() {
        return weight;
    }

    public Screen setWeight(double weight) {
        return new Screen(this.type, this.diagonal, weight);
    }

    public String toString() {
        return "Экран: " +
                "\n\t Тип: " + type +
                "\n\t Диагональ: " + diagonal +
                "\n\t Вес: " + weight;
    }

}
