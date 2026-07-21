// Computer.java

// Product class representing a Computer
public class Computer {

    // Computer specifications
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private boolean bluetooth;
    private boolean wifi;

    // Private constructor called only by Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.bluetooth = builder.bluetooth;
        this.wifi = builder.wifi;
    }

    // Display computer configuration
    public void displayConfiguration() {

        System.out.println("-------------------------------------");
        System.out.println("Computer Configuration");
        System.out.println("-------------------------------------");
        System.out.println("CPU            : " + cpu);
        System.out.println("RAM            : " + ram);
        System.out.println("Storage        : " + storage);
        System.out.println("Graphics Card  : " + graphicsCard);
        System.out.println("Bluetooth      : " + (bluetooth ? "Yes" : "No"));
        System.out.println("Wi-Fi          : " + (wifi ? "Yes" : "No"));
        System.out.println("-------------------------------------\n");
    }

    // Static Nested Builder Class
    public static class Builder {

        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private boolean bluetooth;
        private boolean wifi;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Builder setWiFi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        // Build the Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}