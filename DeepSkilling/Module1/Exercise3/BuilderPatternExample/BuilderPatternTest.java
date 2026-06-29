// BuilderPatternTest.java

public class BuilderPatternTest {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("      Builder Pattern Demonstration");
        System.out.println("===========================================\n");

        // Gaming Computer
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32 GB")
                .setStorage("1 TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setBluetooth(true)
                .setWiFi(true)
                .build();

        // Office Computer
        Computer officeComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM("16 GB")
                .setStorage("512 GB SSD")
                .setGraphicsCard("Integrated Graphics")
                .setBluetooth(false)
                .setWiFi(true)
                .build();

        System.out.println("Gaming Computer");
        gamingComputer.displayConfiguration();

        System.out.println("Office Computer");
        officeComputer.displayConfiguration();

        System.out.println("Builder Pattern implemented successfully.");
    }
}