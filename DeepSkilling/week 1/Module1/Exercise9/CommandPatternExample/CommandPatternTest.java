// CommandPatternTest.java

public class CommandPatternTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("        Home Automation System");
        System.out.println("         Command Pattern Demo");
        System.out.println("==========================================\n");

        // Receiver
        Light light = new Light();

        // Commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        System.out.println("Pressing ON Button...");
        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println("\n------------------------------\n");

        System.out.println("Pressing OFF Button...");
        remote.setCommand(lightOff);
        remote.pressButton();

        System.out.println("\n------------------------------------------");
        System.out.println("Commands executed successfully.");
        System.out.println("Command Pattern implemented successfully.");
        System.out.println("------------------------------------------");
    }
}