public enum KeyboardType {
    MECHANICAL("Механическая"),
    MEMBRANE("Мембранная"),
    WIRELESS("Беспроводная");

    private String name;

    KeyboardType(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}
