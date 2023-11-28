public class Computer {
    //Приватные перемнные для хранения информации о компьютере
    private  final String vendor; // Производитель
    private  final String name; // Название
    private Processor processor; // Процессор
    private Memory memory; // Память
    private Storage storage; // Хранилище
    private Screen screen; // Экран
    private Keyboard keyboard; // Клавиатура
    private static int counter = 0; // Счетчик экзепляров класса

    // Метод возвращающее строковое представление обьекта
    public String toString() {
        return "Компьютер {" +
                "\n\t===================================" +
                "\n\t Производитель = " + vendor +
                "\n\t Наименование = " + name + '\'' +
                "\n\t ___________________________________" +
                "\n\t" + processor.toString() +
                "\n\t ___________________________________" +
                "\n\t" + memory.toString() +
                "\n\t ____________________________________" +
                "\n\t" + storage.toString() +
                "\n\t ____________________________________" +
                "\n\t" + screen.toString() +
                "\n\t ____________________________________" +
                "\n\t" + keyboard.toString() +
                "\n\t =====================================";
    }

    //Конструктор класса

    public Computer(String vendor, String name, Processor processor, Memory memory, Storage storage, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
        counter++;
    }

    public double getTotalWeight() {
        return processor.getWeight() + memory.getWeight() + storage.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public String getVendor() {
        return vendor;
    }

    public Computer setVendor(String vendor) {
        return new Computer(vendor, this.name, this.processor, this.memory, this.storage, this.screen, this.keyboard);
    }

    public String getName() {
        return name;
    }

    public Computer setName(String name) {
        return new Computer(this.vendor, name, this.processor, this.memory, this.storage, this.screen, this.keyboard);
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }



}
