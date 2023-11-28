public enum ProcessorType {
    INTEL("Intel"),
    AMD("AMD"),
    AMD_RYZEN("AMD Ryzen"),
    INTEL_CORE("Intel Core");

    private final String name;

    ProcessorType(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
