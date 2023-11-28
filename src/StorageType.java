public enum StorageType {
    HDD("HDD"),
    SSD("SSD");

    private String name;

    StorageType(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
