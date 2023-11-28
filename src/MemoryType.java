public enum MemoryType {
    DDR3("DDR3"),
    DDR4("DDR4"),
    DDR5("DDR5");

    private String name;

    MemoryType(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

