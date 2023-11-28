import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Processor processor1 = new Processor(3.40, 8, ProcessorType.INTEL_CORE, 1.5);
        Memory memory1 = new Memory(MemoryType.DDR4, 8,1 );
        Storage storage1 = new Storage(StorageType.SSD, 1000, 1);
        Screen screen1 = new Screen( ScreenType.TN, 15, 3.4);
        Keyboard keyboard1 = new Keyboard(KeyboardType.MECHANICAL,  "Cиний", 1.4);

        Computer computer1 = new Computer("SONY", "XPS 13", processor1, memory1, storage1, screen1, keyboard1);
        System.out.println(computer1.toString());
        System.out.println("Общий вес компьютера: " + computer1.getTotalWeight() + " кг ");

        Processor processor2 = new Processor(2.6, 4, ProcessorType.AMD_RYZEN, 3);
        Memory memory2 = new Memory(MemoryType.DDR5, 16, 2);
        Storage storage2 = new Storage(StorageType.HDD, 490, 2);
        Screen screen2 = new Screen(ScreenType.IPS, 19,5);
        Keyboard keyboard2 = new Keyboard(KeyboardType.WIRELESS, "Зеленая", 2);

        Computer computer2 = new Computer("ASUS", "MasterRox 15", processor2, memory2, storage2, screen2, keyboard2);
        System.out.println(computer2.toString());
        System.out.println("Общий вес компьютера: " + computer2.getTotalWeight() + " кг ");
    }
}
