public enum ScreenType {
    IPS("IPS"),
    TN("TN"),
    VA("VA");

    private String name;

    ScreenType(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
